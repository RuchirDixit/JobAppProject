package com.practice.JobApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String jobInterestCategory;
    private String role;

    public User(Integer id, String username, String password, String email, String jobInterestCategory, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.jobInterestCategory = jobInterestCategory;
        this.role = role;
    }
    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobInterestCategory() {
        return jobInterestCategory;
    }

    public void setJobInterestCategory(String jobInterestCategory) {
        this.jobInterestCategory = jobInterestCategory;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
