package com.example.demo.joboffer;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobOfferController {
	
	@Autowired
	private JobOfferService jobOfferService;
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public List<JobOffer> getData() {
		return jobOfferService.getJobOffers();
	}
	
	@CrossOrigin
	@GetMapping("/search")
	public List<JobOffer> searchData(@RequestParam(value = "title") String title, @RequestParam(value = "city") String city){
		return jobOfferService.searchOffers(title, city);
	}
}
