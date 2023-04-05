package com.yash.otw.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CandidateSkills implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int cskillsId;
	@OneToOne(cascade = CascadeType.DETACH)
	private Skills skills;
	
	public int getCskillsId() {
		return cskillsId;
	}
	public void setCskillsId(int cskillsId) {
		this.cskillsId = cskillsId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Skills getSkills() {
		return skills;
	}
	@OneToOne(cascade = CascadeType.ALL)
	private Candidate candidate;
	private int rating_range;
	
	public void setSkills(Skills skills) {
		this.skills = skills;
	}

	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}	public int getRating_range() {
		return rating_range;
	}
	public void setRating_range(int rating_range) {
		this.rating_range = rating_range;
	}
		
}
