package com.practice.JobApp.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class JobPost {

    @Id
    private int postId;

    @Column(name = "profile")
    private String postProfile;

    @Column(name = "description")
    private String postDesc;

    @Column(name = "required_experience")
    private Integer reqExperience;

    @Column(name = "tech_stack")
    private List<String> postTechStack;

    public JobPost() {}

    public JobPost(int postId, String postProfile, String postDesc, Integer reqExperience, List<String> postTechStack) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }

    public int getPostId() { return postId; }
    public String getPostProfile() { return postProfile; }
    public String getPostDesc() { return postDesc; }
    public Integer getReqExperience() { return reqExperience; }
    public List<String> getPostTechStack() { return postTechStack; }
}

