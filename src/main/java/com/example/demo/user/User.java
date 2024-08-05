package com.example.demo.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
