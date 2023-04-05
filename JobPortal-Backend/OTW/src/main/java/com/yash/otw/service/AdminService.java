package com.yash.otw.service;

import com.yash.otw.model.Admin;

public interface AdminService {

	Admin regAdmin(Admin adm);

	Admin findAdminByEmailId(String tempadmin_username);

	Admin findAdminByEmailIdAndPassword(String emailId, String password);

}
