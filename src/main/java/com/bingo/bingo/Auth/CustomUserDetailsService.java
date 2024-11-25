package com.bingo.bingo.Auth;

import com.bingo.bingo.Models.UserModel;
import com.bingo.bingo.Repositories.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) {
        // Load user from database by email
        UserModel user = userRepository.findByEmail(email);

        if (user == null) {
            throw new UsernameNotFoundException("User not found with email: " + email);
        }

        // Create and return a UserDetails instance with the user information
        return User.builder()
                   .username(user.getEmail())
                   .password(user.getPassword_hash())
                   .roles(user.getRole().getRole_name())  // Assuming your UserModel has a role
                   .build();
    }
}
