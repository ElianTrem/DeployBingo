package com.bingo.bingo.Auth;

public class LoginResponse {
    private String role;
    private int userId;
    private String userName;

    public LoginResponse(String role) {
        this.role = role;
    }

    public LoginResponse(String roleName, int userId, String userName) {

        this.role = roleName;

        this.userId = userId;

        this.userName = userName;

    }

    // Getter
    public String getRole() {
        return role;
    }

    // Setter
    public void setRole(String role) {
        this.role = role;
    }

    // Getter
    public int getUserId() {
        return userId;
    }

    // Setter
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Getter

    public String getUserName() {

        return userName;

    }

    // Setter

    public void setUserName(String userName) {

        this.userName = userName;

    }
}

