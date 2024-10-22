package com.example.demo.user;

import java.util.List;
import java.util.Set;

import com.example.demo.joboffer.JobOffer;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Table(name="users")
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private String email;
	private String displayName;
	
	@OneToMany(mappedBy="user")
	@JsonBackReference
	private List<JobOffer> jobOffers;
	
	public User() {}
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public User(String name, String email, String displaName) {
		this.name = name;
		this.email = email;
		this.displayName = displaName;
	}
	


}
