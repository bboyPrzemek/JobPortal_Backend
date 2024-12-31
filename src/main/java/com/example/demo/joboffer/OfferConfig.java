package com.example.demo.joboffer;

import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.blazebit.persistence.Criteria;
import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.spi.CriteriaBuilderConfiguration;
import com.example.demo.experience.Experience;
import com.example.demo.experience.ExperienceRepository;
import com.example.demo.location.Location;
import com.example.demo.location.LocationRepository;
import com.example.demo.position.Position;
import com.example.demo.position.PositionRepository;
import com.example.demo.technology.Technology;
import com.example.demo.technology.TechnologyRepository;
import com.example.demo.user.User;
import com.example.demo.user.UserService;
import com.example.demo.user.UserRepository;
import com.example.demo.worktype.Worktype;
import com.example.demo.worktype.WorktypeRepository;

import jakarta.persistence.EntityManagerFactory;

@Configuration

public class OfferConfig {
	
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Bean
	public CriteriaBuilderFactory createCriteriaBuilderFactory() {
	    CriteriaBuilderConfiguration config = Criteria.getDefault();
	    return config.createCriteriaBuilderFactory(entityManagerFactory);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(
			JobOfferRepository jobOfferRepository, 
			//UserRepository userRepository,
			UserService userService,
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
			u.setEmail("5");
			u.setPassword("555");
			Location l = new Location("Koszalin", "zachodniopomorskie");
			
			locationRepository.save(l);
		
			u = userService.saveUser(u);
			JobOffer j = 
					new JobOffer("Ania", "opis", Double.valueOf(7000), Double.valueOf(10000), u, l, tset,eset, position, worktypeSet);
			j.setCreatedDate(new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime());
			
			jobOfferRepository.save(j);
			
			
			User  u2 = new User("abc", "bccc", "Accenture");
			u2.setEmail("1");
			u2.setPassword("2");
			
			u2 = userService.saveUser(u2);
			Location l1 = new Location("Poznań", "wielkopolskie");
			locationRepository.save(l1);
			
			
			for (int i = 0; i< 100; i++) {
				JobOffer j2 = new JobOffer("Przykladowa oferta" + i, "opis2 + 1",Double.valueOf(5000+ 1), Double.valueOf(6000+ i),u2,l1,tset,eset, position2, worktypeSet2);
				Integer k = i;
				if (k == 30) {
					k = 0;
				}
				
				j2.setCreatedDate(new GregorianCalendar((2014+k), Calendar.MARCH, (11+k)).getTime());
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
