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

import com.yash.otw.model.CandidateEmploymentHistroy;
import com.yash.otw.service.CanEmpHisService;

@RestController
@RequestMapping("/otw/api")
@CrossOrigin("*")
public class CanEmpHisController {

	@Autowired
	private CanEmpHisService canemphisService;
	
	@PostMapping("/saveceh")
	public ResponseEntity<CandidateEmploymentHistroy> saveCEH(@RequestBody CandidateEmploymentHistroy ceh){
		
		CandidateEmploymentHistroy newceh = canemphisService.saveCEHDetails(ceh);
		
		return new ResponseEntity<CandidateEmploymentHistroy>(newceh,HttpStatus.CREATED);
	}
	
	@GetMapping("/getceh")
	public ResponseEntity<List<CandidateEmploymentHistroy>> getEmpHistory(){
		
		List<CandidateEmploymentHistroy> cehlist = canemphisService.getAll();
		
		return new ResponseEntity<List<CandidateEmploymentHistroy>>(cehlist,HttpStatus.OK);
	}
}
