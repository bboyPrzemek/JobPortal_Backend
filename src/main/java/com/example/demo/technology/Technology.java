package com.example.demo.technology;

import java.util.Set;

import com.example.demo.joboffer.JobOffer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;

@Getter
@AllArgsConstructor
@Entity
public class Technology {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String name;
}
