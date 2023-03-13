package com.yash.otw.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yash.otw.model.Admin;
import com.yash.otw.model.Candidate;
import com.yash.otw.model.Employer;
import com.yash.otw.response.Response;
import com.yash.otw.service.AdminService;
import com.yash.otw.service.CandidateService;
import com.yash.otw.service.EmployerService;

@RestController
@RequestMapping("/otw/api")
@CrossOrigin("*")
public class AdminController {

	private static Logger logger = LogManager.getLogger(AdminController.class);
	
	@Autowired
	private CandidateService candiService;

	@Autowired
	private AdminService adminservice;

	@Autowired
	private EmployerService empserService;

	
	@PostMapping("/regAdmin")
	public ResponseEntity<Response> registerAdmin(@RequestParam("admin") String admin) throws Exception {

		Admin adm = new ObjectMapper().readValue(admin, Admin.class);

		Admin adminobj = adminservice.regAdmin(adm);

		if (adminobj != null) {
			return new ResponseEntity<Response>(new Response("admin registered"), HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Response>(new Response("admin not registered"), HttpStatus.CREATED);
		}

	}

	@PostMapping("/login")
	@CrossOrigin(origins = "")
	public Admin loginAdmin(@RequestBody Admin admin) throws Exception {
		String tempemail = admin.getEmailId();
		String temppass = admin.getPassword();
		Admin adminobj = null;
		if (tempemail != null && temppass != null) {
			adminobj = adminservice.findAdminByEmailIdAndPassword(tempemail, temppass);
		}
		if (adminobj == null) {
			throw new Exception("wrong data");
		}

		return adminobj;
	}

	@GetMapping("/allcandidates")
	public ResponseEntity<List<Candidate>> getAllCandidate() {
		logger.info("info" +adminservice.toString());

		List<Candidate> candidates = candiService.findAllCandidates();
		return new ResponseEntity<List<Candidate>>(candidates, HttpStatus.OK);

	}

	@GetMapping("/allemployers")
	public ResponseEntity<List<Employer>> getEmployers() {
		List<Employer> employers = empserService.getAllEmployers();

		return new ResponseEntity<List<Employer>>(employers, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEmployer(@PathVariable int id) {
		empserService.deleteEmployer(id);
		return "employer deleted";

	}

	@DeleteMapping("/deletecan/{candidateId}")
	public String deleteData(@PathVariable("candidateId") int candidateId) {

		candiService.deletedata(candidateId);
		return "candidate deleted successfully";
	}

	@PutMapping("/update")
	public ResponseEntity<Employer> updateEmployer(@RequestBody Employer employer) {

		Employer updateemp = empserService.updateEmployer(employer);
		return new ResponseEntity<>(updateemp, HttpStatus.CREATED);
	}

	@GetMapping("/getCandidateById/{candidateId}")
	public Candidate getCandidateById(@PathVariable("candidateId") int candidateId){

		return candiService.getCandidateByCandidateId(candidateId);
		
	
	}
}
