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
	
	public User saveUser(User user) {
		User u = new User(user.getDisplayName(),user.getEmail(), "aaa");
		u.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(u);
	}

	

}
