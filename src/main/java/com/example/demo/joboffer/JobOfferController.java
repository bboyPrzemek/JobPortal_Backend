package com.example.demo.joboffer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.blazebit.persistence.PagedList;

import jakarta.validation.Valid;

@RestController
public class JobOfferController {
	
	@Autowired
	private JobOfferService jobOfferService;
	
	
	@CrossOrigin
	@GetMapping
	public JobOfferDTO searchData(JobOfferSearchCriteria jobOfferSearchCriteria){
		return jobOfferService.searchOffers(jobOfferSearchCriteria);
	}
	
	@CrossOrigin
	@GetMapping("/s")
	public List<JobOffer> searchData(){
		return jobOfferService.getOffersByUserId();
	}
	
	@CrossOrigin
	@PostMapping("/create")
	public ResponseEntity create(@Valid @RequestBody NewJobOfferDto newJobOfferDto){
		System.out.println(newJobOfferDto.toString());
           return new ResponseEntity<>(jobOfferService.saveJobOffer(newJobOfferDto), HttpStatus.CREATED); 
	}
}
