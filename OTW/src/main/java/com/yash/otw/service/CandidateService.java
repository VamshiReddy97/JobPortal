package com.yash.otw.service;

import java.util.List;
import java.util.Optional;

import com.yash.otw.model.Candidate;

public interface CandidateService {

	Candidate regCandidate(Candidate candidate);

	List<Candidate> findAllCandidates();

	Candidate findCandidateByCandidate_EmailAndCpassword(String tempemail, String temppass);

	Candidate findCandidateByUsernameAndCpassword(String username, String cpassword);

	Optional<Candidate> getDocument(int candidateId);

	void deletedata(int candidateId);

	Candidate getCandidateByCandidateId(int candidateId);

}
