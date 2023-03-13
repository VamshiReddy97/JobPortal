package com.yash.otw.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="ceh")
public class CandidateEmploymentHistroy {
@Id
private int	cehId;
private Date joiningDate;
private Date relievingDate;
private String review;

@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@OneToOne
private Employer employer;
public int getCehId() {
	return cehId;
}
public void setCehId(int cehId) {
	this.cehId = cehId;
}
public Date getJoiningDate() {
	return joiningDate;
}
public void setJoiningDate(Date joiningDate) {
	this.joiningDate = joiningDate;
}
public Date getRelievingDate() {
	return relievingDate;
}
public void setRelievingDate(Date relievingDate) {
	this.relievingDate = relievingDate;
}
public String getReview() {
	return review;
}
public void setReview(String review) {
	this.review = review;
}
public Employer getEmployer() {
	return employer;
}
public void setEmployer(Employer employer) {
	this.employer = employer;
}

}
