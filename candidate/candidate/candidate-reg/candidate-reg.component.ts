import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { CommonService } from 'src/app/shared/common.service';
import { Location } from '@angular/common';
import { Candidate } from 'src/app/model/candidate';
@Component({
  selector: 'app-candidate-reg',
  templateUrl: './candidate-reg.component.html',
  styleUrls: ['./candidate-reg.component.css']
})
export class CandidateRegComponent implements OnInit {

  registerCandidate:FormGroup;
  candidateobj:Candidate;
  public candidateCV:any=File;
  constructor(private common: CommonService,
    private location:Location,
  ) {

    document.title="Candidate Registration";
    this.candidateobj= new Candidate();
    
    this.registerCandidate = new FormGroup({
      
      candidateFirstname:new FormControl('',Validators.required),
      candidateMiddlename:new FormControl('',Validators.required),
      candidateLastname:new FormControl('',Validators.required),
      candidateEmail:new FormControl('',Validators.required),
      username:new FormControl('',Validators.required),
      cpassword:new FormControl('',Validators.required),
      candidateAddress:new FormControl('',Validators.required),
      candidateCity:new FormControl('',Validators.required),
      candidate_gender:new FormControl('',Validators.required),
      candidateMobileno:new FormControl('',Validators.required),
      candidatePincode:new FormControl('',Validators.required),
      candidate_exp_years:new FormControl('',Validators.required),
      candidate_exp_months:new FormControl('',Validators.required),
      candidate_dob:new FormControl('',Validators.required),
// candidate_CV:new FormControl('',Validators.required)
    })
  
  }

  onSelectFile(event:any){
    const file = event.target.files[0];
    console.log(file);
    this.candidateCV=file;
  }


  ngOnInit(): void {
  }
  saveCandidate(){

    if(this.registerCandidate.valid)
    {
      const candidate = this.registerCandidate.value;
      var formdata = new FormData();
      formdata.append('candidate',JSON.stringify(candidate));
      formdata.append('file',this.candidateCV,this.candidateCV.file_name);
      this.common.saveCandidateProfileToServer(formdata).subscribe(
        (response)=>
        {console.log(response);}
      )
      
    }else{
      this.registerCandidate.value;
      
    }

    this.location.back();
  }
  
}