package com.yash.otw.controller;
import com.fasterxml.jackson.core.JsonParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.otw.model.Job;
import com.yash.otw.service.EmployerService;
import com.yash.otw.service.JobService;

@RestController
@RequestMapping("/otw/api")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class JobController {

	@Autowired
	private JobService jobservice;
	
	@Autowired
	private EmployerService empservice;
	
	@PostMapping("/addjob")
	public ResponseEntity<Job> saveJob(@RequestBody Job job)throws JsonParseException{
		
		Job newjob = jobservice.saveJobDetails(job);
		
		return new ResponseEntity<>(newjob, HttpStatus.CREATED);
		
		
	}
	/*
	 * @PostMapping("/addjob/{id}") public ResponseEntity<Job> saveJob(@RequestBody
	 * Job job,@PathVariable("id") int id)throws JsonParseException{
	 * 
	 * Job newjob = jobservice.saveJobDetails(job);
	 * 
	 * return new ResponseEntity<>(newjob, HttpStatus.CREATED);
	 * 
	 * 
	 * }
	 */
	
	
	@GetMapping("/alljobs")
	public ResponseEntity<List<Job>> getAllJobs(){
		
		List<Job> jobs = jobservice.findAllJobs();
		
		return new ResponseEntity<List<Job>>(jobs,HttpStatus.OK);
	}
	
	@GetMapping("/jobpostedbyemp/{id}")
	public ResponseEntity<List<Job>> getJobPostedByEmployer(@PathVariable int id)
	{
	List<Job> jobpostedlist = jobservice.findJobPostedByEmployer(id);
	
	return new ResponseEntity<List<Job>>(jobpostedlist,HttpStatus.OK);
	}
	
	@PostMapping("/postjob")
	public ResponseEntity<Job> addjob(@RequestBody Job job)
	{
	
		return new ResponseEntity<Job>(jobservice.saveJobDetails(job),HttpStatus.CREATED);
	}
	
	
	@PutMapping("/update/{jobId}")
	public ResponseEntity<Job> updateJob(@PathVariable int jobId, @RequestBody Job job){
		Job jobfound = jobservice.findByJobId(jobId);
		
		
		if(jobfound == null) {
			return new ResponseEntity<Job>(HttpStatus.NOT_FOUND);
		}
		
		try {
			jobfound.setJobId(job.getJobId());
			jobfound.setJob_title(job.getJob_title());
			jobfound.setJob_description(job.getJob_description());
			jobfound.setJob_skills(job.getJob_skills());
			jobfound.setJob_exp_years(job.getJob_exp_years());
			jobfound.setJob_exp_month(job.getJob_exp_month());
			jobfound.setJob_location(job.getJob_location());
			jobfound.setJob_post_date(job.getJob_post_date());
			jobfound.setJob_post_date(job.getJob_post_date());
			jobfound.setLast_date_apply(job.getLast_date_apply());
			jobfound.setEmployer(job.getEmployer());
			return new ResponseEntity<Job>(jobservice.saveJobDetails(jobfound),HttpStatus.CREATED);
					
			
			
			
		}catch(DataAccessException e) {
			return new ResponseEntity<Job>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	
	@DeleteMapping("/deletejob/{jobId}")
	public ResponseEntity<?> deleteJob(@PathVariable int jobId,@RequestBody Job job){
		
		jobservice.delete(jobId);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
}
