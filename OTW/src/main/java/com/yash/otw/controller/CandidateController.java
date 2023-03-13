package com.yash.otw.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Optional;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yash.otw.model.Candidate;
import com.yash.otw.response.Response;
import com.yash.otw.service.CandidateService;

@RestController
@RequestMapping("/otw/api")
@CrossOrigin("*")
public class CandidateController {

	@Autowired
	private CandidateService candidateService;

	@Autowired
	private ServletContext context;

	// private static final String DIRECTORY = System.getProperty("candidate") +
	// "/Downloads/uploads/";

	@PostMapping("/regCan")
	public ResponseEntity<Response> regCandidate(@RequestParam("file") MultipartFile file,
			@RequestParam("candidate") String candidate) throws JsonMappingException, JsonParseException, IOException {

		Candidate can = new ObjectMapper().readValue(candidate, Candidate.class);
		can.setCandidateCV(file.getBytes());
		can.setFileName(file.getOriginalFilename());
		can.setCreatedDate(new Date());
		Candidate candb = candidateService.regCandidate(can);
		if (candb != null) {
			return new ResponseEntity<Response>(new Response("candidate registered"), HttpStatus.OK);
		} else {
			return new ResponseEntity<Response>(new Response("candidate not registered"), HttpStatus.BAD_REQUEST);
		}

	}

	@PostMapping("/regCanToServer")
	public ResponseEntity<Response> regCandidateToServer(@RequestParam("file") MultipartFile file,
			@RequestParam("candidate") String candidate) throws JsonMappingException, JsonParseException, IOException {

		Candidate can = new ObjectMapper().readValue(candidate, Candidate.class);
		can.setCreatedDate(new Date());

		
		boolean isExist =new File(context.getRealPath("/candidateprofile/")).exists();
		if(!isExist) {
			new File(context.getRealPath("/candidateprofile/")).mkdir();
		}
		
		String filename = file.getOriginalFilename();
		String modifyFileName = FilenameUtils.getBaseName(filename)+"_"+System.currentTimeMillis()+"."+FilenameUtils.getExtension(filename);
		File serverfile = new File(context.getRealPath("/candidateprofile/"+File.separator+modifyFileName));
		
		try {
			FileUtils.writeByteArrayToFile(serverfile, file.getBytes());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		can.setFileName(modifyFileName);
		
		Candidate candb = candidateService.regCandidate(can);
		if (candb != null) {
			return new ResponseEntity<Response>(new Response("candidate registered"), HttpStatus.OK);
		} else {
			return new ResponseEntity<Response>(new Response("candidate not registered"), HttpStatus.BAD_REQUEST);
		}

	}

	@PostMapping("/logincan")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public Candidate loginCandidate(@RequestBody Candidate candidate) throws Exception {

		String tempusername = candidate.getUsername();
		String temppass = candidate.getCpassword();
		Candidate candidateobj = null;

		if (tempusername != null && temppass != null) {
			{
				candidateobj = candidateService.findCandidateByUsernameAndCpassword(tempusername, temppass);
			}
			if (candidateobj == null) {
				throw new Exception("wrong data");
			}
		}

		return candidateobj;
	}

	@GetMapping("/getdoc/{candidateId}")
	public Optional<Candidate> getDocument(@PathVariable int candidateId) {
		return candidateService.getDocument(candidateId);
	}
	
	/*
	 * @GetMapping("/download/{candidateId}") public
	 * ResponseEntity<ByteArrayResource> downloadFile(@PathVariable("") int
	 * candidateId) { Candidate can =
	 * candidateService.getDocument(candidateId).get(); return ResponseEntity.ok()
	 * .contentType(MediaType.parseMediaType(can.getCandidateCV())); }
	 */
}
