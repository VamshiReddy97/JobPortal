package com.yash.otw.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jobId;
	private String job_title;
	private String job_skills;
	private int job_exp_years;
	private int job_exp_month;
	private String job_location;
	private Date job_post_date;
	private String job_description;
	private Date last_date_apply;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.DETACH)
	@JoinColumn(name="employer_id")
	private Employer employer;

	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	/*
	 *
	 * 
	 * public Employer getEmployer() { return employer; } public void
	 * setEmployer(Employer employer) { this.employer = employer; }
	 */

	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getJob_skills() {
		return job_skills;
	}
	public void setJob_skills(String job_skills) {
		this.job_skills = job_skills;
	}
	public int getJob_exp_years() {
		return job_exp_years;
	}
	public void setJob_exp_years(int job_exp_years) {
		this.job_exp_years = job_exp_years;
	}
	public int getJob_exp_month() {
		return job_exp_month;
	}
	public void setJob_exp_month(int job_exp_month) {
		this.job_exp_month = job_exp_month;
	}
	public String getJob_location() {
		return job_location;
	}
	public void setJob_location(String job_location) {
		this.job_location = job_location;
	}
	public Date getJob_post_date() {
		return job_post_date;
	}
	public void setJob_post_date(Date job_post_date) {
		this.job_post_date = job_post_date;
	}
	public String getJob_description() {
		return job_description;
	}
	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}
	public Date getLast_date_apply() {
		return last_date_apply;
	}
	public void setLast_date_apply(Date last_date_apply) {
		this.last_date_apply = last_date_apply;
	}
	

}
