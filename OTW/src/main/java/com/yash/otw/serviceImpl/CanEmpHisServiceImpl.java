package com.yash.otw.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.otw.model.CandidateEmploymentHistroy;
import com.yash.otw.repository.CanEmpHisRepo;
import com.yash.otw.service.CanEmpHisService;

@Service
public class CanEmpHisServiceImpl implements CanEmpHisService {

	@Autowired
	private CanEmpHisRepo canemphisRepo;

	@Override
	public CandidateEmploymentHistroy saveCEHDetails(CandidateEmploymentHistroy ceh) {
		// TODO Auto-generated method stub
		return canemphisRepo.save(ceh);
	}

	@Override
	public List<CandidateEmploymentHistroy> getAll() {
		// TODO Auto-generated method stub
		return canemphisRepo.findAll();
	}
}
