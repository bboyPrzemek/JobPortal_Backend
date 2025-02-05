package com.example.demo.joboffer;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blazebit.persistence.PagedList;
import com.example.demo.experience.Experience;
import com.example.demo.experience.ExperienceService;
import com.example.demo.location.Location;
import com.example.demo.location.LocationService;
import com.example.demo.position.Position;
import com.example.demo.position.PositionService;
import com.example.demo.technology.Technology;
import com.example.demo.technology.TechnologyService;
import com.example.demo.user.User;
import com.example.demo.user.UserService;
import com.example.demo.worktype.Worktype;
import com.example.demo.worktype.WorktypeService;

@Service
public class JobOfferService {
	
	@Autowired
	private JobOfferRepository jobOfferRepository;
	@Autowired
	private UserService userService;
	@Autowired
	private ExperienceService experienceService;
	@Autowired
	private PositionService positionService;
	@Autowired
	private TechnologyService technologyService;
	@Autowired
	private WorktypeService worktypeService;
	@Autowired
	private LocationService locationService;
	
	
	
	public List<JobOffer> getJobOffers(){
		List<JobOffer> jobOffers = jobOfferRepository.findAll();
		return jobOffers;
	}
	
	public PagedList<JobOffer> searchOffers(JobOfferSearchCriteria jobOfferSearchCriteria){
		return jobOfferRepository.findJobOffers(jobOfferSearchCriteria);
	}
	
	public List<JobOffer> getOffersByUserId(){
		Long userId = userService.getLoggedUserId();
		return jobOfferRepository.findJobOffersByUserId(userId);
	}
	
	public JobOffer saveJobOffer(NewJobOfferDto newJobOfferDto) {
		List<String> experiences =  Arrays.asList(newJobOfferDto.getExperiences());
		String position = newJobOfferDto.getPosition();
		List<String> technologies = Arrays.asList(newJobOfferDto.getTechnologies());
		List<String> workTypes = Arrays.asList(newJobOfferDto.getWorktypes());
		String location = newJobOfferDto.getLocation();
		String title = newJobOfferDto.getTitle();
		String details = newJobOfferDto.getDetails();
		Double salaryMin = newJobOfferDto.getSalaryMin();
		Double salaryMax = newJobOfferDto.getSalaryMax();
		
		Set<Experience> exp = experienceService.searchExperinceWhereNameIn(experiences);
		Set<Technology> tech = technologyService.searchTechnologyWhereNameIn(technologies);
		Set<Worktype> wt = worktypeService.searchWorktypeWhereNameIn(workTypes);
		Position pos = positionService.searchPositionByName(position);
		Location loc = locationService.findLocationByCity(location);
		
		
		
		Long userId = userService.getLoggedUserId();
		User user = userService.findUserById(userId).get();
		
		JobOffer jobOffer = new JobOffer();
		jobOffer.setUser(user);
		jobOffer.setExperiences(exp);
		jobOffer.setTechnologies(tech);
		jobOffer.setWorktypes(wt);
		jobOffer.setPosition(pos);
		jobOffer.setLocation(loc);
		jobOffer.setSalaryMax(salaryMax);
		jobOffer.setSalaryMin(salaryMin);
	
		jobOffer.setTitle(title);
		jobOffer.setDetails(details);
		
		JobOffer j = jobOfferRepository.save(jobOffer);
		
		return j;
	}
	
	public void removeJobOffer(){
		
	}
}
