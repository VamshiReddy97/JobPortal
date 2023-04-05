package com.yash.otw.service;

import java.util.List;

import com.yash.otw.model.JobApplication;

public interface JobApplicationService {

	JobApplication saveJobApplication(JobApplication jobApplication);

	List<JobApplication> findAllJobApplication();
}
