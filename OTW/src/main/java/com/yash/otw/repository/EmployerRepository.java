package com.yash.otw.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yash.otw.model.Employer;
import com.yash.otw.model.Job;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Integer> {

	Employer findByEmailIDAndPass(String emailID, String pass);

	Job save(Job job);

	Optional<?> deleteEmployerById(int id);


	List<Employer> findAll();
	
	
	//Employer findEmployerByEmailIDandPassword(String emailID,String pass);
	

}
