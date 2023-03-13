package com.yash.otw.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.otw.exception.ResourceNotFoundException;
import com.yash.otw.model.Employer;
import com.yash.otw.model.Job;
import com.yash.otw.repository.EmployerRepository;
import com.yash.otw.service.EmployerService;
@Transactional
@Service
public class EmployerServiceImpl implements EmployerService {

	@Autowired
	private EmployerRepository emprepo;
	
	@Override
	public Employer saveEmployerData(Employer employer) {
		// TODO Auto-generated method stub
		return emprepo.save(employer);
	}

	@Override
	public List<Employer> getAllEmployers() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	@Override
	public Employer findByEmailIDAndPassword(String emailID, String pass) {
		// TODO Auto-generated method stub
		return emprepo.findByEmailIDAndPass(emailID,pass);
	}

	@Override
	public Job saveJobDetails(Job job) {
		// TODO Auto-generated method stub
		return emprepo.save(job);
	}

	@Override
	public  Optional<?> deleteEmployer(int id) {
		return emprepo.deleteEmployerById(id);
				}

	@Override
	public Employer findEmployerById(int id) {
		// TODO Auto-generated method stub
		return emprepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " +id));
	}

	@Override
	public Employer regEmployer(Employer employer) {
		// TODO Auto-generated method stub
		return emprepo.save(employer);
	}

	@Override
	public List<Employer> getAllEmployersAndJobsPosted() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	@Override
	public Employer addEmployer(Employer employer) {
		// TODO Auto-generated method stub
		return emprepo.save(employer);
	}

	@Override
	public Employer get(int id) {
		// TODO Auto-generated method stub
		return emprepo.findById(id).get();
	}

	@Override
	public Employer updateEmployer(Employer employer) {
		int id = employer.getId();
		Employer emp = emprepo.findById(id).get();
		emp.setEmployer_name(emp.getEmployer_name());
		emp.setEmailID(emp.getEmailID());
		emp.setEmployer_address(emp.getEmployer_address());
		emp.setEmployer_city(emp.getEmployer_city());
		emp.setPass(emp.getPass());
		emp.setStatus(emp.isStatus());
	//	emp.setJob(emp.getJob());
		return emprepo.save(employer);
	}

	@Override
	public List<Job> findJobPostedByEmployer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
