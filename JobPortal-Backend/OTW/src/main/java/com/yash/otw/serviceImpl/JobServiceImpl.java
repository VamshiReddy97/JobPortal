package com.yash.otw.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.otw.model.Job;
import com.yash.otw.model.JobApplication;
import com.yash.otw.repository.EmployerRepository;
import com.yash.otw.repository.JobRespository;
import com.yash.otw.service.JobService;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private JobRespository jobrepo;

	@Autowired
	private EmployerRepository empreRepository;
	
	@Override
	public Job saveJobDetails(Job job) {
		// TODO Auto-generated method stub
		return jobrepo.save(job);
	}

	@Override
	public List<Job> findAllJobs() {
		// TODO Auto-generated method stub
		return jobrepo.findAll();
	}

	@Override
	public Job findByJobId(int jobId) {
		// TODO Auto-generated method stub
		return jobrepo.findByJobId(jobId);
	}

	@Override
	public void delete(int jobId) {
		jobrepo.deleteByJobId(jobId);
	}

	@Override
	public List<Job> findJobPostedByEmployer(int id) {
		// TODO Auto-generated method stub
		return jobrepo.findJobPostedByEmployer(id);
	}


}
