package com.yash.otw.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.yash.otw.model.Employer;
import com.yash.otw.model.Job;

public interface EmployerService {

	Employer saveEmployerData(Employer employer);

	List<Employer> getAllEmployers();

	Employer findByEmailIDAndPassword(String tempemail, String temppass);

	Job saveJobDetails(Job job);

	Optional<?> deleteEmployer(int id);

	Employer findEmployerById(int id);

	Employer regEmployer(Employer employer);

	List<Employer> getAllEmployersAndJobsPosted();

	Employer addEmployer(Employer employer);

	Employer get(int id);

	Employer updateEmployer(Employer employer);

	//@Query("select j from job where j.employer_id = :employer_id")
	List<Job> findJobPostedByEmployer(int id);

	



}
