package com.example.demo.security;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.example.demo.user.User;
import com.example.demo.user.UserDetailsImpl;

@Component
public class SecurityContextHelper {

    public UserDetailsImpl getLoggedUserDetails() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated() && !(authentication instanceof AnonymousAuthenticationToken)) {
            UserDetailsImpl userDetailsImpl = (UserDetailsImpl)authentication.getPrincipal();
            return userDetailsImpl;
        }
        return null;
    }
}
