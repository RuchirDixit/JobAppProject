package com.practice.JobApp.repositories;

import com.practice.JobApp.models.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByPostProfileContainingIgnoreCaseOrPostDescContainingIgnoreCase(String profileKeyword, String descKeyword);
}
