package com.yash.otw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.otw.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

	Candidate findCandidateByUsernameAndCpassword(String username, String cpassword);

	void deleteByCandidateId(int candidateId);

	Candidate getCandidateByCandidateId(int candidateId);

}
