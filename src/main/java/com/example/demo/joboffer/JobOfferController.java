package com.example.demo.joboffer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@CrossOrigin
	@GetMapping("/s")
	public List<JobOffer> searchData(){
		return jobOfferService.getOffersByUserId();
	}
	
	@CrossOrigin
	@PostMapping("/create")
	public ResponseEntity<String> create(@RequestBody NewJobOfferDto newJobOfferDto){
		JobOffer jobOffer = jobOfferService.saveJobOffer(newJobOfferDto);
         if (jobOffer != null) {
             return new ResponseEntity<>("Created", HttpStatus.CREATED);
         } else {
             return new ResponseEntity<>("Error", HttpStatus.INTERNAL_SERVER_ERROR);
         }
	}
}
