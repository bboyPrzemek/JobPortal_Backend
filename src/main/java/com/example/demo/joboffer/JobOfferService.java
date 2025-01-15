package com.example.demo.joboffer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blazebit.persistence.PagedList;

@Service
public class JobOfferService {
	
	@Autowired
	private JobOfferRepository jobOfferRepository;
	
	public List<JobOffer> getJobOffers(){
		List<JobOffer> jobOffers = jobOfferRepository.findAll();
		return jobOffers;
	}
	
	public PagedList<JobOffer> searchOffers(JobOfferSearchCriteria jobOfferSearchCriteria){
		return jobOfferRepository.findJobOffers(jobOfferSearchCriteria);
	}
	
	public List<JobOffer> getOffersByUserId(Long Id){
		return jobOfferRepository.findJobOffersByUserId(Id);
	}
}
