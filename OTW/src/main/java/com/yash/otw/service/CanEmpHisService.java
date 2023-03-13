package com.yash.otw.service;

import java.util.List;

import com.yash.otw.model.CandidateEmploymentHistroy;

public interface CanEmpHisService {

	CandidateEmploymentHistroy saveCEHDetails(CandidateEmploymentHistroy ceh);

	List<CandidateEmploymentHistroy> getAll();

}
