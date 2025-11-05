package com.practice.JobApp.services;

import com.practice.JobApp.models.User;
import com.practice.JobApp.models.UserDTO;
import com.practice.JobApp.models.UserPrincipal;
import com.practice.JobApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * CustomUserDetailsService implements UserDetailsService to load user-specific data during authentication.
 */

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new UserPrincipal(user);
    }

    public void registerUser(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.username());
        user.setPassword(encoder.encode(userDTO.password()));
        user.setRole(userDTO.role());
        user.setEmail(userDTO.email());
        user.setJobInterestCategory(userDTO.jobInterestCategory());
        userRepository.save(user);
    }
}
