package com.practice.JobApp.controllers;

import com.practice.JobApp.models.JobPost;
import com.practice.JobApp.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:9000")   // Allowing requests from frontend server (react app is running on localhost:9000)
public class JobController {

    @Autowired
    private JobService jobService;


    @GetMapping("/jobposts")
    public List<JobPost> getAllJobPosts() {
        return jobService.getAllJobPosts();
    }

    @GetMapping("/jobpost/{id}")
    public JobPost getJobPostById(@PathVariable Integer id){
        return jobService.getJobPostById(id);
    }

    @PostMapping("/jobpost")
    public JobPost addJobPost(@RequestBody JobPost jobPost) {
        jobService.saveJobPost(jobPost);
        return jobService.getJobPostById(jobPost.getPostId());
    }
}
