package com.yash.otw.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Candidate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int candidateId;

	private String candidateFirstname;

	public String getCandidateFirstname() {
		return candidateFirstname;
	}

	public void setCandidateFirstname(String candidateFirstname) {
		this.candidateFirstname = candidateFirstname;
	}

	private String candidateMiddlename;

	private String candidateLastname;

	private String candidateEmail;

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String candidateAddress;

	private String candidateCity;

	private String candidateMobileno;

	private int candidatePincode;

	private int candidate_exp_years;

	private int candidate_exp_months;

	private Date candidate_dob;

	@Lob
	private byte[] candidateCV;
	
	private Date createdDate;
	private Date updatedDate;
	private String fileName;
	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getCandidateMiddlename() {
		return candidateMiddlename;
	}

	public void setCandidateMiddlename(String candidateMiddlename) {
		this.candidateMiddlename = candidateMiddlename;
	}

	public String getCandidateLastname() {
		return candidateLastname;
	}

	public void setCandidateLastname(String candidateLastname) {
		this.candidateLastname = candidateLastname;
	}

	public String getCandidateEmail() {
		return candidateEmail;
	}

	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}

	public String getCandidateAddress() {
		return candidateAddress;
	}

	public void setCandidateAddress(String candidateAddress) {
		this.candidateAddress = candidateAddress;
	}

	public String getCandidateCity() {
		return candidateCity;
	}

	public void setCandidateCity(String candidateCity) {
		this.candidateCity = candidateCity;
	}

	public String getCandidateMobileno() {
		return candidateMobileno;
	}

	public void setCandidateMobileno(String candidateMobileno) {
		this.candidateMobileno = candidateMobileno;
	}

	public int getCandidatePincode() {
		return candidatePincode;
	}

	public void setCandidatePincode(int candidatePincode) {
		this.candidatePincode = candidatePincode;
	}

	public byte[] getCandidateCV() {
		return candidateCV;
	}

	public void setCandidateCV(byte[] candidateCV) {
		this.candidateCV = candidateCV;
	}

	private String cpassword;

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	private String candidate_gender;

	public String getCandidate_gender() {
		return candidate_gender;
	}

	public void setCandidate_gender(String candidate_gender) {
		this.candidate_gender = candidate_gender;
	}


	public int getCandidate_exp_years() {
		return candidate_exp_years;
	}

	public void setCandidate_exp_years(int candidate_exp_years) {
		this.candidate_exp_years = candidate_exp_years;
	}

	public int getCandidate_exp_months() {
		return candidate_exp_months;
	}

	public void setCandidate_exp_months(int candidate_exp_months) {
		this.candidate_exp_months = candidate_exp_months;
	}

	public Date getCandidate_dob() {
		return candidate_dob;
	}

	public void setCandidate_dob(Date candidate_dob) {
		this.candidate_dob = candidate_dob;
	}

	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", candidateFirstname=" + candidateFirstname
				+ ", candidateMiddlename=" + candidateMiddlename + ", candidateLastname=" + candidateLastname
				+ ", candidateEmail=" + candidateEmail + ", username=" + username + ", candidateAddress="
				+ candidateAddress + ", candidateCity=" + candidateCity + ", candidateMobileno=" + candidateMobileno
				+ ", candidatePincode=" + candidatePincode + ", candidate_exp_years=" + candidate_exp_years
				+ ", candidate_exp_months=" + candidate_exp_months + ", candidate_dob=" + candidate_dob
				+ ", candidateCV=" + Arrays.toString(candidateCV) + ", cpassword=" + cpassword + ", candidate_gender="
				+ candidate_gender + "]";
	}
	
	

}
