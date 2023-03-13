import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Candidate } from 'src/app/model/candidate';
import { CommonService } from 'src/app/shared/common.service';

@Component({
  selector: 'app-candidate-list',
  templateUrl: './candidate-list.component.html',
  styleUrls: ['./candidate-list.component.css']
})
export class CandidateListComponent implements OnInit {

  candidates : Candidate[]=[];

  candidate: Candidate;

  candidateToUpdate = {
   candidateId:0,
   candidateFirstname:'',
   candidateMiddlename:'',
   candidateLastname:'',
   candidateEmail:'',
   username:'',
   cpassword:'',
   candidateAddress:'',
   candidateCity:'',
   candidateMobileno:'',
   candidatePincode:0,
   candidate_exp_years:0,
   candidate_exp_months:0,
   candidate_dob:'',
   candidateCV:''

  };

  constructor(private commonser: CommonService,private loc :Location,private router: Router) {

  
   }

  ngOnInit(): void {

    this.commonser.listCandidate().subscribe
    (data=>{this.candidates= data})
  }

  view(link:string){
    console.log('in view method');
    // this.commonser.viewDoc(link);
    alert('download');
    
  }



  downloadfile(){
    const link = document.createElement('a');
    link.setAttribute('target','blank');
    link.setAttribute('href','_File_Saved_Path');
    link.setAttribute('download','file_name.pdf');
    document.body.appendChild(link);
    link.click();
    link.remove();
  }

  deletecandidate(candidateId:number){
    this.commonser.deleteCandidate(candidateId)
    .subscribe(data=>{
      this.candidates = this.candidates.filter(candidate => candidate.candidateId=candidateId);
      this.loc.back
    })
  }


  updateCandidate(){}

  editCandidate(candidateId:number){
    this.router.navigate(['/candidate-reg',{candidateId:candidateId}]);
  }

}
