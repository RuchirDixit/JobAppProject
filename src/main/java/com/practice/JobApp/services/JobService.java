package com.practice.JobApp.services;

import com.practice.JobApp.models.JobPost;
import com.practice.JobApp.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public void saveJobPost(JobPost jobPost) {
        jobRepository.addJob(jobPost);
    }

    public List<JobPost> getAllJobPosts() {
        return jobRepository.getAllJobs();
    }

    public JobPost getJobPostById(Integer id) {
        return jobRepository.getJobPostById(id);
    }
}
