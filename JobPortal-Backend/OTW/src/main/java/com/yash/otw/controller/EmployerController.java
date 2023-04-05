package com.yash.otw.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yash.otw.exception.ResourceNotFoundException;
import com.yash.otw.model.Employer;
import com.yash.otw.model.Job;
import com.yash.otw.response.Response;
import com.yash.otw.service.EmployerService;
import com.yash.otw.service.JobService;

@RestController
@CrossOrigin(origins = "*" ,allowedHeaders = "*")
@RequestMapping("/otw/api")
public class EmployerController {

	Logger logger = LogManager.getLogger(EmployerController.class); 
	
	@Autowired
	private EmployerService empservice;

	@Autowired
	private JobService jobservice;

	/*
	 * @PostMapping("/regEmp") public ResponseEntity<String>
	 * saveEmployr(@RequestBody Employer employer) {
	 * empservice.saveEmployerData(employer);
	 * 
	 * return ResponseEntity.ok("data saved"); }
	 */
	@PostMapping("/regEmp")
	public ResponseEntity<Response> saveEmployer(@RequestParam("employer") String employer) throws Exception {

		Employer emp = new ObjectMapper().readValue(employer, Employer.class);

		Employer employerobj = empservice.regEmployer(emp);

		if (employerobj != null) {
			return new ResponseEntity<Response>(new Response("emp registered"), HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Response>(new Response("emp not registered"), HttpStatus.CREATED);
		}

	}
	public String loginEmployer() {
		return null;

	}

	@SuppressWarnings("unused")
	@PostMapping("/loginEmp")
	@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
	public Employer loginEmployer(@RequestBody Employer employer) throws Exception {

		String tempemail = employer.getEmailID();
		String temppass = employer.getPass();
		
		if(employer.isStatus()==true)
		{
			Employer employerobj = null;
			if(tempemail != null && temppass != null) {
				employerobj = empservice.findByEmailIDAndPassword(tempemail, temppass);
			} 
			if(employerobj == null){
				throw new Exception("wrong data");
			}
			return employerobj;
		}else
		{
			return null;
		}
		

	}
	
	@GetMapping("/employer/{id}")
	public ResponseEntity<Employer> getEmployerById(@PathVariable("id") int id) throws ResourceNotFoundException{
	
		logger.info("Info: = " +id);
		logger.warn("Warning: = " +id);
		logger.warn("Error: = "+id);
		
		Employer employer = empservice.findEmployerById(id);
				
		return ResponseEntity.ok().body(employer);
	}
	
	@GetMapping("/emplist")
	public ResponseEntity<List<Employer>> getEmployers(){
		List<Employer> emplist = empservice.getAllEmployers();
		
		return new ResponseEntity<List<Employer>>(emplist,HttpStatus.OK);
	}
	
	@PutMapping("/addjob/{id}")
	public ResponseEntity<String> addJobbyEmployer(@RequestBody Employer employer ,@PathVariable("id") int id ){
		
		empservice.saveEmployerData(employer);
		
		return  ResponseEntity.ok("data saved");
		
	}
	
	@GetMapping("/getEmpoyerandjob")
	public ResponseEntity<List<Employer>> getEmployerWithJobPosted(){
		
		List<Employer> empjobs = empservice.getAllEmployersAndJobsPosted();
		
		return new ResponseEntity<List<Employer>>(empjobs,HttpStatus.OK);
		
		
	}
	
	@PostMapping("/regemployer")
	public ResponseEntity<Employer> addEmployer(@RequestBody Employer employer){
		Employer newemployer = empservice.addEmployer(employer);
		return new ResponseEntity<Employer>(newemployer,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/jobs")
	public ResponseEntity<List<Job>> listofJob(){
		return new ResponseEntity<>(jobservice.findAllJobs(),HttpStatus.OK);
	}
}