package com.yash.otw.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.otw.model.JobApplication;
import com.yash.otw.repository.JobApplicationRepository;
import com.yash.otw.service.JobApplicationService;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {

	@Autowired
	private JobApplicationRepository jobapprepo;
	
	@Override
	public JobApplication saveJobApplication(JobApplication jobApplication) {
		// TODO Auto-generated method stub
		return jobapprepo.save(jobApplication);
	}

	@Override
	public List<JobApplication> findAllJobApplication() {
		// TODO Auto-generated method stub
		return jobapprepo.findAll();
	}

}
