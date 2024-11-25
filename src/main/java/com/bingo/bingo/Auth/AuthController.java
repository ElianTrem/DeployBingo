package com.bingo.bingo.Auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.bingo.Models.UserModel;
import com.bingo.bingo.Repositories.UserRepository;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @PostMapping("/login")
public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
    // Retrieve the user by email
    UserModel user = userRepository.findByEmail(loginRequest.getEmail());

    if (user == null) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                             .body("User not found with email: " + loginRequest.getEmail());
    }

    // Verify password using BCrypt
    if (!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword_hash())) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                             .body("Invalid password");
    }

    // Return the user's role
    String roleName = user.getRole().getRole_name();
    return ResponseEntity.ok(new LoginResponse(roleName));
}

}

