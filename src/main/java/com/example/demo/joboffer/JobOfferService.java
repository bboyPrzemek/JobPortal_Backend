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
		return jobOffers;
	}
	
	public List<JobOffer> searchOffers(String title, String city, Double salaryMin, Double salaryMax, String experience, String technology, String position, String workType){
		
		System.out.println("______________________");
		return jobOfferRepository.findJobOffers(title, city, salaryMin, salaryMax, experience, technology, position, workType);
		//return jobOfferRepository.findByTitleContainingIgnoreCase(title, city, salaryMin, salaryMax);
	}
}
