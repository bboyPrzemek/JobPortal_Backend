package com.example.demo.joboffer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Setter
@Getter
public class NewJobOfferDto {
	private String title;
	private String details;
	private String location;
	private String position;
	private Double salaryMin;
	private Double salaryMax;
	private String[] experiences;
	private String[] technologies;
	private String[] worktypes;
	
	
	@Override
	public String toString() {
		return "NewJobOfferDto [title=" + title + ", details=" + details + ", location=" + location + ", experiences="
				+ experiences + ", position=" + position + ", technologies=" + technologies + ", worktypes="
				+ worktypes + "]";
	}
	

	
}
