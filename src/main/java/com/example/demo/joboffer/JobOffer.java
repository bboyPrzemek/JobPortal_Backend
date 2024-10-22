package com.example.demo.joboffer;

import java.util.Set;

import org.hibernate.FetchMode;
import org.hibernate.annotations.Fetch;

import com.example.demo.experience.Experience;
import com.example.demo.location.Location;
import com.example.demo.technology.Technology;
import com.example.demo.user.User;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JobOffer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String title;
	private String details;
	private Double salaryMin;
	private Double salaryMax;
	
	@ManyToOne
	@JsonManagedReference
	private User user;
	
	@ManyToOne
	private Location location;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable( 
				name = "offers_technologies", 
				joinColumns = @JoinColumn(name = "offer_id"),
				inverseJoinColumns = @JoinColumn(name = "technology_id"))
	private Set<Technology> technologies;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
				name = "offers_experiences", 
				joinColumns = @JoinColumn(name = "offer_id"),
				inverseJoinColumns = @JoinColumn(name = "experience_id"))
	private Set<Experience> experiences;
	
	public JobOffer(String title, String details, User user) {
		this.title = title;
		this.details = details;
		this.user = user;
	}
	
	public JobOffer(String title, String details,Double salaryMin, Double salaryMax, User user, Location location) {
		this.title = title;
		this.details = details;
		this.salaryMin = salaryMin;
		this.salaryMax = salaryMax;
		this.user = user;
		this.location = location;
	}

	@Override
	public String toString() {
		return "JobOffer [Id=" + Id + ", title=" + title + ", details=" + details + ", salaryMin=" + salaryMin
				+ ", salaryMax=" + salaryMax + ", user=" + user + ", location=" + location + "]";
	}
	
}
