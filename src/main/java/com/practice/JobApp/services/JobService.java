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
        jobRepository.save(jobPost);
    }

    public List<JobPost> getAllJobPosts() {
        return jobRepository.findAll();
    }

    public JobPost getJobPostById(Integer id) {
        return jobRepository.findById(id).orElse(null);
    }

    public void updateJobPost(JobPost jobPost) {
        jobRepository.save(jobPost);
    }

    public void deleteJobPost(int jobPostId) {
        jobRepository.deleteById(jobPostId);
    }

    public List<JobPost> getJobPostsByKeyWord(String keyword) {
        return jobRepository.findByPostProfileContainingIgnoreCaseOrPostDescContainingIgnoreCase(keyword, keyword);
    }
}
