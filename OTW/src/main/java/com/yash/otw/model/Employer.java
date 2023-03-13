package com.yash.otw.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Employer{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String employer_name;
	private String emailID;
	private String pass;
	private String employer_address;
	private String employer_city;
	private boolean status;
	/*
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name ="fk_job_id")
	 */
	/*
	 * @JsonIgnore
	 * 
	 * @OneToMany(cascade = CascadeType.ALL,mappedBy = "employer") private Set<Job>
	 * job;
	 */
	 

	/*
	 * public Set<Job> getJob() { return job; } public void setJob(Set<Job> job) {
	 * this.job = job; }
	 */
	public String getEmployer_name() {
		return employer_name;
	}
	public void setEmployer_name(String employer_name) {
		this.employer_name = employer_name;
	}

	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmployer_address() {
		return employer_address;
	}
	public void setEmployer_address(String employer_address) {
		this.employer_address = employer_address;
	}
	public String getEmployer_city() {
		return employer_city;
	}
	public void setEmployer_city(String employer_city) {
		this.employer_city = employer_city;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	
}
