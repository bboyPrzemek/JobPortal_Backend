package com.example.demo.joboffer;

import com.example.demo.location.Location;
import com.example.demo.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@Getter

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
	@JoinColumn(name="locationId", nullable = true)
	private Location location;
	
	@ManyToOne
	@JoinColumn(name="userId", nullable = false)
	private User user;
	
	
	
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
	
	public JobOffer() {}

	@Override
	public String toString() {
		return "JobOffer [Id=" + Id + ", title=" + title + ", details=" + details + ", salaryMin=" + salaryMin
				+ ", salaryMax=" + salaryMax + ", user=" + user + "]";
	}
	
	public String getTitle() {
		return this.title;
	}
	
	
	
}
