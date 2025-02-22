package com.example.demo.joboffer;
import java.util.List;
import java.util.Set;

import com.example.demo.experience.Experience;
import com.example.demo.location.Location;
import com.example.demo.position.Position;
import com.example.demo.technology.Technology;
import com.example.demo.user.User;
import com.example.demo.worktype.Worktype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JobOfferDTO {
		private List<JobOffer> jobOffers;
		private Integer currentPage;
		private Integer pages;
		private Long totalRecords;
}
