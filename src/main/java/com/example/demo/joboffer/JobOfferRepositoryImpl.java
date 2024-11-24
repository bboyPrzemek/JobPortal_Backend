package com.example.demo.joboffer;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class JobOfferRepositoryImpl implements JobOfferRepositoryCustom{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<JobOffer> findJobOffers(String title, String city, Double salaryMin, Double salaryMax, String experience, String technology, String position, String workType) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<JobOffer> criteriaQuery = criteriaBuilder.createQuery(JobOffer.class);
		Root<JobOffer> jobOffer = criteriaQuery.from(JobOffer.class);
		
		jobOffer.fetch("location", JoinType.LEFT);
		jobOffer.fetch("technologies", JoinType.LEFT);
		jobOffer.fetch("experiences", JoinType.LEFT);
		jobOffer.fetch("user", JoinType.LEFT);
		jobOffer.fetch("position", JoinType.LEFT);
		jobOffer.fetch("worktypes", JoinType.LEFT);
		List<Predicate> predicates = new ArrayList<>();
		
		if (!title.isBlank()) {
			predicates.add(criteriaBuilder.like(criteriaBuilder.lower(jobOffer.get("title")), "%" + title.toLowerCase() + "%"));
		}
		
		if (!city.isBlank()) {
			predicates.add(criteriaBuilder.equal(jobOffer.get("location").get("city"), city ));
		}
		
		if (salaryMin != null && salaryMin > 0) {
			predicates.add(criteriaBuilder.greaterThanOrEqualTo(jobOffer.get("salaryMin"), salaryMin));
		}
		
		if (salaryMax != null && salaryMax > 0) {
			predicates.add(criteriaBuilder.lessThanOrEqualTo(jobOffer.get("salaryMax"), salaryMax));
		}
		
		if (!experience.isBlank()) {
			predicates.add(criteriaBuilder.equal(jobOffer.get("experiences").get("name"), experience));
		}
		
		if (!technology.isBlank()) {
			predicates.add(criteriaBuilder.equal(jobOffer.get("technologies").get("name"), technology));
		}
		
		if (!position.isBlank()) {
			predicates.add(criteriaBuilder.equal(jobOffer.get("position").get("name"), position));
		}
		
		if (!workType.isBlank()) {
			predicates.add(criteriaBuilder.equal(jobOffer.get("worktypes").get("name"), workType));
		}
		
		
		 criteriaQuery.where(predicates.toArray(new Predicate[0]));
		 return entityManager.createQuery(criteriaQuery).getResultList();
		 
	}

}
