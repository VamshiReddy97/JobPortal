package com.yash.otw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.otw.model.Skills;
import com.yash.otw.service.SkillsService;

@RestController
@RequestMapping("/otw/api")
@CrossOrigin("*")
public class SkillsController {

	@Autowired
	public SkillsService skillsService;
	
	@PostMapping("/saveskill")
	public ResponseEntity<Skills> saveSkills(@RequestBody Skills skills){
	
		Skills skill = skillsService.saveSkillsDetails(skills);
		return new  ResponseEntity<Skills>(skill,HttpStatus.CREATED);
		
	}
	
	
	
	
}
