package com.example.demo.joboffer;

import com.blazebit.persistence.PagedList;

public interface JobOfferRepositoryCustom {
	PagedList<JobOffer> findJobOffers(JobOfferSearchCriteria jobOfferSearchCriteria);
	
	
}
