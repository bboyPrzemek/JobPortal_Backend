package com.example.demo.joboffer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blazebit.persistence.PagedList;

@RestController
public class JobOfferController {
	
	@Autowired
	private JobOfferService jobOfferService;
	
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
}
