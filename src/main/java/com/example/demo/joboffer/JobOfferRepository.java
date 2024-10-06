package com.example.demo.joboffer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobOfferRepository extends JpaRepository<JobOffer, Long>{
	List<JobOffer> findByTitleContainingIgnoreCase(String title);
}
