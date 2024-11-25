package com.bingo.bingo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.bingo.Models.UserModel;
import com.bingo.bingo.Services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/insert")
    public UserModel insertUser(@RequestBody UserModel user) {
        return userService.insertUser(user);
    }

    @PutMapping("/edit")
    public UserModel updateUser(@RequestBody UserModel user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/delete/{idUser}")
    public Optional<UserModel> deleteUser(@PathVariable int idUser) {
        return userService.deleteUser(idUser);
    }
}
