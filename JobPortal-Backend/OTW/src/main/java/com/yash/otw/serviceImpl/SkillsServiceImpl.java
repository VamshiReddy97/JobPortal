package com.yash.otw.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.otw.model.Skills;
import com.yash.otw.repository.SkillRepository;
import com.yash.otw.service.SkillsService;

@Service
public class SkillsServiceImpl implements SkillsService {

	@Autowired
	private SkillRepository skillRepository;
	
	@Override
	public Skills saveSkillsDetails(Skills skills) {
		// TODO Auto-generated method stub
		return skillRepository.save(skills);
	}

}
