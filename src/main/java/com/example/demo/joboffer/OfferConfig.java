package com.example.demo.joboffer;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.experience.Experience;
import com.example.demo.experience.ExperienceRepository;
import com.example.demo.location.Location;
import com.example.demo.location.LocationRepository;
import com.example.demo.position.Position;
import com.example.demo.position.PositionRepository;
import com.example.demo.technology.Technology;
import com.example.demo.technology.TechnologyRepository;
import com.example.demo.user.User;
import com.example.demo.user.UserRepository;
import com.example.demo.worktype.Worktype;
import com.example.demo.worktype.WorktypeRepository;

@Configuration
public class OfferConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(
			JobOfferRepository jobOfferRepository, 
			UserRepository userRepository,
			LocationRepository locationRepository, 
			ExperienceRepository experienceRepository,
			TechnologyRepository technologyRepository,
			PositionRepository positionRepository,
			WorktypeRepository worktypeRepository) {
		return args->{
			
			Set<Worktype> worktypeSet = new HashSet<>();
			Worktype remote = new Worktype("Remote");
			worktypeRepository.save(remote);
			worktypeSet.add(remote);
			
			Set<Worktype> worktypeSet2 = new HashSet<>();
			Worktype office = new Worktype("Office");
			worktypeRepository.save(office);
			worktypeSet2.add(office);
			
			Position position = new Position("Backend");
			positionRepository.save(position);
			
			Position position2 = new Position("Frontend");
			positionRepository.save(position2);
			
			
			Experience exp = new Experience("Mid");
			Set<Experience> eset = new HashSet<>();
			experienceRepository.save(exp);
			eset.add(exp);
			
			Technology t = new Technology("Salesforce");
			Set<Technology> tset = new HashSet<>();
			technologyRepository.save(t);
			tset.add(t);
			
			User  u = new User("a", "b", "TTMS Koszalin");
			Location l = new Location("Koszalin", "zachodniopomorskie");
			
			locationRepository.save(l);
		
			userRepository.save(u);
			JobOffer j = 
					new JobOffer("Ania", "opis", Double.valueOf(7000), Double.valueOf(10000), u, l, tset,eset, position, worktypeSet);
			
			jobOfferRepository.save(j);
			
			
			User  u2 = new User("abc", "bccc", "Accenture");
			userRepository.save(u2);
			Location l1 = new Location("Poznań", "wielkopolskie");
			locationRepository.save(l1);
			
			
			for (int i = 0; i< 5; i++) {
				JobOffer j2 = new JobOffer("Przykladowa oferta", "opis2",Double.valueOf(5000), Double.valueOf(6000),u2,l1,tset,eset, position2, worktypeSet2);
				
				jobOfferRepository.save(j2);
			}
			
			Location l2 = new Location("Warszawa", "Mazowieckie");
			Location l3 = new Location("Gdańsk", "pomorskie");
			Location l4 = new Location("Kraków", "małopolskie");
			Location l5= new Location("Lublin", "lubelskie");
			
			locationRepository.save(l2);
			locationRepository.save(l3);
			locationRepository.save(l4);
			locationRepository.save(l5);
		};
	}
		


}
