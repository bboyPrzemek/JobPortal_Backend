package com.example.demo.joboffer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JobOfferService {
	
	@Autowired
	private JobOfferRepository jobOfferRepository;
	
	
	
	public List<JobOffer> getJobOffers(){
		List<JobOffer> jobOffers = jobOfferRepository.findAll();
		System.out.print(jobOffers.size());
		return jobOffers;
	}

}
