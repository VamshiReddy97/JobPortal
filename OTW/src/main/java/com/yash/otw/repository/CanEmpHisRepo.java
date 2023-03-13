package com.yash.otw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.otw.model.CandidateEmploymentHistroy;

public interface CanEmpHisRepo extends JpaRepository<CandidateEmploymentHistroy, Integer>  {

}
