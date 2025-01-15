package com.example.demo.joboffer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;

import com.blazebit.persistence.PagedList;
import com.example.demo.security.SecurityContextHelper;
import com.example.demo.user.UserService;

@RestController
public class JobOfferController {
	
	@Autowired
	private JobOfferService jobOfferService;
	@Autowired
	private UserService userService;
	
	@CrossOrigin
	@GetMapping
	public JobOfferDTO searchData(JobOfferSearchCriteria jobOfferSearchCriteria){
		PagedList<JobOffer> pagedJobOffers = jobOfferService.searchOffers(jobOfferSearchCriteria);
		
		return new JobOfferDTO(
				pagedJobOffers,
				pagedJobOffers.getPage(), 
				pagedJobOffers.getTotalPages(),
				pagedJobOffers.getTotalSize());
		
	}
	
	
	@CrossOrigin
	@GetMapping("/s")
	public List<JobOffer> searchData(){
		Long userId = userService.getLoggedUserId();
		List<JobOffer> pagedJobOffers = jobOfferService.getOffersByUserId(userId);
		return pagedJobOffers;
	}
	
}
