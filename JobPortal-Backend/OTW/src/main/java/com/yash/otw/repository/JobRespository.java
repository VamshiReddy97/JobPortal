package com.yash.otw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.otw.model.Job;
import com.yash.otw.model.JobApplication;

@Repository
public interface JobRespository extends JpaRepository<Job,Integer> {

	Job findByJobId(int jobId);

	void deleteByJobId(int jobId);

	JobApplication save(JobApplication jobapplication);

	List<Job> findJobPostedByEmployer(int id);
}
