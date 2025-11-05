package com.practice.JobApp.models;

public record UserDTO(
            String username,
            String password,
            String email,
            String jobInterestCategory,
            String role
) {
}
