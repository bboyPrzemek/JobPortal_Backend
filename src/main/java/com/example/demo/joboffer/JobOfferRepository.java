package com.example.demo.joboffer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JobOfferRepository extends JpaRepository<JobOffer, Long>{
	
	@Query("SELECT j, loc, u, t, exp from JobOffer j "
			+ "join fetch j.location loc "
			+ "join fetch j.user u "
			+ "left join fetch j.technologies t "
			+ "left join fetch j.experiences exp where "
			+ "j.title ILIKE %:title% AND loc.city ILIKE %:city%")
	List<JobOffer> findByTitleContainingIgnoreCase(String title, String city);
	
	
	@Override
	@Query("SELECT j, loc, u, t, exp from JobOffer j "
			+ "join fetch j.location loc "
			+ "join fetch j.user u "
			+ "left join fetch j.technologies t "
			+ "left join fetch j.experiences exp")
	List<JobOffer> findAll();
	
	
	
}
