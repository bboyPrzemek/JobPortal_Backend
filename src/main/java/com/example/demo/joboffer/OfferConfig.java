package com.example.demo.joboffer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.location.Location;
import com.example.demo.location.LocationRepository;
import com.example.demo.user.User;
import com.example.demo.user.UserRepository;

@Configuration
public class OfferConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(
			JobOfferRepository jobOfferRepository, UserRepository userRepository,LocationRepository locationRepository) {
		return args->{
			User  u = new User("a", "b", "TTMS Koszalin");
			Location l = new Location("Koszalin", "zachodniopomorskie");
			locationRepository.save(l);
		
			userRepository.save(u);
			JobOffer j = 
					new JobOffer("Ania", "opis", Double.valueOf(7000), Double.valueOf(10000), u, l);
			
			jobOfferRepository.save(j);
			
			
			User  u2 = new User("abc", "bccc", "Accenture");
			userRepository.save(u2);
			Location l1 = new Location("Poznań", "wielkopolskie");
			locationRepository.save(l1);
			
			
			for (int i = 0; i< 5; i++) {
				JobOffer j2 = new JobOffer("Przykladowa oferta", "opis2",Double.valueOf(5000), Double.valueOf(6000),u2,l1);
				
				jobOfferRepository.save(j2);
			}
		};
	}
		


}
