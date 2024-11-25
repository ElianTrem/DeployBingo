package com.bingo.bingo.Auth;

public class LoginResponse {
    private String role;

    public LoginResponse(String role) {
        this.role = role;
    }

    // Getter
    public String getRole() {
        return role;
    }

    // Setter
    public void setRole(String role) {
        this.role = role;
    }
}

