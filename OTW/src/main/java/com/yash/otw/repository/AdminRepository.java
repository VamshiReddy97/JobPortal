package com.yash.otw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.otw.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

	Admin findByUsername(String username);

	Admin findByEmailId(String emailId);

	Admin findAdminByEmailIdAndPassword(String emailId, String password);

	
}
