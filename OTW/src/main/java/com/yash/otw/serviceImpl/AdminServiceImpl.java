package com.yash.otw.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.otw.model.Admin;
import com.yash.otw.repository.AdminRepository;
import com.yash.otw.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public Admin regAdmin(Admin adm) {
		
		return adminRepository.save(adm);
	}

	@Override
	public Admin findAdminByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return adminRepository.findByEmailId(emailId);
	}

	@Override
	public Admin findAdminByEmailIdAndPassword(String emailId, String password) {
		// TODO Auto-generated method stub
		return adminRepository.findAdminByEmailIdAndPassword(emailId,password);
	}

}
