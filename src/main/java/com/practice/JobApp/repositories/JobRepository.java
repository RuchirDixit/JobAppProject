package com.practice.JobApp.repositories;

import com.practice.JobApp.models.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepository {

    // arrayList to store JobPost objects
    List<JobPost> jobs = new ArrayList<>();

    public JobRepository() {

        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));

        jobs.add(
                new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
                        3, List.of("HTML", "CSS", "JavaScript", "React")));

        jobs.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                List.of("Python", "Machine Learning", "Data Analysis")));

        jobs.add(new JobPost(4, "Network Engineer",
                "Design and implement computer networks for efficient data communication", 5,
                List.of("Networking", "Cisco", "Routing", "Switching")));

        jobs.add(new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
                        3, List.of("iOS Development", "Android Development", "Mobile App")));

        jobs.add(
                new JobPost(6, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines",
                        4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes")));

        jobs.add(new JobPost(7, "UI/UX Designer", "Create engaging user experiences and intuitive user interfaces",
                        2, List.of("User Experience", "User Interface Design", "Prototyping")));

        jobs.add(new JobPost(8, "Cybersecurity Analyst", "Protect computer systems and networks from cyber threats",
                        4, List.of("Cybersecurity", "Network Security", "Incident Response")));

        jobs.add(new JobPost(9, "Full Stack Developer", "Experience in both front-end and back-end development",
                5, List.of("JavaScript", "Node.js", "React", "Spring", "MongoDB")));

        jobs.add(new JobPost(10, "Cloud Architect", "Design and implement cloud infrastructure solutions", 6,
                List.of("Cloud Computing", "AWS", "Azure", "Google Cloud")));

        jobs.add(new JobPost(11, "Software Tester", "Ensure software quality through testing and validation", 3,
                List.of("Testing", "JUnit", "Selenium", "TestNG")));

    }

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJob(JobPost jobPost) {
        jobs.add(jobPost);
    }
}
