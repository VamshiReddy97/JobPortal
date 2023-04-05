package com.yash.otw.serviceImpl;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.otw.model.Candidate;
import com.yash.otw.repository.CandidateRepository;
import com.yash.otw.service.CandidateService;
@Transactional
@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	private CandidateRepository candidateRepository;

	@Override
	public Candidate regCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		return candidateRepository.save(candidate);
	}

	@Override
	public List<Candidate> findAllCandidates() {
		// TODO Auto-generated method stub
		return candidateRepository.findAll();
	}

	@Override
	public Candidate findCandidateByUsernameAndCpassword(String username, String cpassword) {
		// TODO Auto-generated method stub
		return candidateRepository.findCandidateByUsernameAndCpassword(username, cpassword);
	}

	@Override
	public Candidate findCandidateByCandidate_EmailAndCpassword(String tempemail, String temppass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Candidate> getDocument(int candidateId) {
		// TODO Auto-generated method stub

		Optional<Candidate> c = candidateRepository.findById(candidateId);
		return c;
	}

	@Override
	public void deletedata(int candidateId) {
		candidateRepository.deleteByCandidateId(candidateId);
	}

	@Override
	public Candidate getCandidateByCandidateId(int candidateId) {
		// TODO Auto-generated method stub
		return candidateRepository.getCandidateByCandidateId(candidateId);
	}

}
