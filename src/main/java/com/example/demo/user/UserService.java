package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.demo.exceptions.UserExistsException;
import com.example.demo.registration.RegisterUserDTO;

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username);
		
		 if (user == null) {
	            throw new UsernameNotFoundException(username);
	        }
	        return new UserDetailsImpl(user);
	}
	
	public User saveUser(RegisterUserDTO registerUserDTO) throws UserExistsException {
		User user  = userRepository.findByEmail(registerUserDTO.getEmail());
		
		if (user != null) {
			throw new UserExistsException("Email address " +  user.getEmail() + " exists in database!");
		}
		User u = new User(registerUserDTO.getEmail(), passwordEncoder.encode(registerUserDTO.getPassword()), registerUserDTO.getDisplayName());
		return userRepository.save(u);
	}

	

}
