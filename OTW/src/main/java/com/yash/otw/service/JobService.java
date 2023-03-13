package com.yash.otw.service;

import java.util.List;

import com.yash.otw.model.Job;
import com.yash.otw.model.JobApplication;

public interface JobService {

	Job saveJobDetails(Job job);

	List<Job> findAllJobs();

	public Job findByJobId(int jobId);

	void delete(int jobId);

	List<Job> findJobPostedByEmployer(int id);

	//JobApplication saveJobApplication(JobApplication jobapplication);
	
}
