package com.st3.upgrad.Service;

import com.st3.upgrad.Model.CustomUserDetails;
import com.st3.upgrad.Model.User;
import com.st3.upgrad.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String Username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(Username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }
}
