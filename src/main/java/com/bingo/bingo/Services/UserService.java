package com.bingo.bingo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bingo.bingo.Models.UserModel;
import com.bingo.bingo.Repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
    private BCryptPasswordEncoder passwordEncoder;

    public void saveUser(UserModel user) {
        String rawPassword = user.getPassword(); // Get the raw password
        String encodedPassword = passwordEncoder.encode(rawPassword); // Hash the password
        user.setPassword_hash(encodedPassword); // Save the hashed password to the database
        userRepository.save(user); // Save the user to the database
    }

    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public UserModel insertUser(UserModel user) {
        return userRepository.save(user);
    }

    public UserModel updateUser(UserModel user) {
        return userRepository.save(user);
    }

    public Optional<UserModel> deleteUser(int idUser) {
        Optional<UserModel> user = userRepository.findById(idUser);
        try {
            userRepository.deleteById(idUser);
        } catch (Exception e) {
            return null;
        }
        return user;
    }
}
