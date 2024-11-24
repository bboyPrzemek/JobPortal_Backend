package com.example.demo.joboffer;

import java.util.List;

public interface JobOfferRepositoryCustom {
	List<JobOffer> findJobOffers(String title, String city, Double salaryMin, Double salaryMax, String experience, String technology, String position, String worktype);
}
