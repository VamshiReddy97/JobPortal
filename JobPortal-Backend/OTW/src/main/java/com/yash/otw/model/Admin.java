package com.yash.otw.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*Entity class for admin module */

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Admin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int admin_id;
	
	private String admin_name;
	
	private String emailId;
	
	private String username;
	
	private String password;
	

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.DETACH)
	@JoinColumn(name = "candidate_id_fk")
	private Candidate candidate;
	
	@OneToOne(fetch = FetchType.LAZY,cascade= CascadeType.DETACH)
	@JoinColumn(name="employer_id_fk")
	private Employer employer;

	


	

	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public int getAdmin_id() {
		return admin_id;
	}


	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}


	public String getAdmin_name() {
		return admin_name;
	}


	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_name=" + admin_name + ", emailId=" + emailId + ", username="
				+ username + ", password=" + password + ", candidate=" + candidate + ", employer=" + employer + "]";
	}
}
