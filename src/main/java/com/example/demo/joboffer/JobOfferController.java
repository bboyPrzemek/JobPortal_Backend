package com.example.demo.joboffer;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class JobOfferController {
	
	
	@Autowired
	private JobOfferService jobOfferService;
	

	
	@RequestMapping(method = RequestMethod.GET)
	public List<JobOffer> getData() {
		List<JobOffer> s = jobOfferService.getJobOffers();
		System.out.print(s.size());
		return s;
	}
	

}
