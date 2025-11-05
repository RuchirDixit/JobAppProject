package com.practice.JobApp.controllers;

import com.practice.JobApp.models.UserDTO;
import com.practice.JobApp.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController handles user-related HTTP requests.
 */

@RestController
public class UserController {

    @Autowired
    private CustomUserDetailsService userService;

    @PostMapping("/user")
    public String createUser(@RequestBody UserDTO userDTO) {
        userService.registerUser(userDTO);
        return "User created successfully!";
    }
}
