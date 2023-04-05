package com.yash.otw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.otw.model.Candidate;
import com.yash.otw.model.JobApplication;
import com.yash.otw.service.CandidateService;
import com.yash.otw.service.JobApplicationService;
import com.yash.otw.service.JobService;

@RestController
@RequestMapping("/otw/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class JobApplicationController {

	@Autowired
	private JobApplicationService jobapplicationService;
	
	@Autowired
	private JobService jobService;

	@Autowired
	private CandidateService cadService;

	@PostMapping("/applyjob")
	public ResponseEntity<JobApplication> applyJob(@RequestBody JobApplication jobapplication) {
		return new ResponseEntity<JobApplication>(jobapplicationService.saveJobApplication(jobapplication), HttpStatus.CREATED);
	}
	
	@GetMapping("/allcan")
	public ResponseEntity<List<Candidate>> getAllCandidate() {

		List<Candidate> candidates = cadService.findAllCandidates();
		return new ResponseEntity<List<Candidate>>(candidates, HttpStatus.OK);

	}
	
	@GetMapping("/alljobapplication")
	public ResponseEntity<List<JobApplication>> getAllApplication(){
	
		List<JobApplication> jobapplications = jobapplicationService.findAllJobApplication();
		return new ResponseEntity<List<JobApplication>>(jobapplications,HttpStatus.OK);
	}
}