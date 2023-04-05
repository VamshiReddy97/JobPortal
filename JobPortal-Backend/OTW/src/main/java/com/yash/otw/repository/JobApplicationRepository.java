package com.yash.otw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.otw.model.JobApplication;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Integer> {

}
