import { Component, OnInit } from '@angular/core';
import { CommonService } from 'src/app/shared/common.service';
import { FormGroup,FormControl, NgForm} from '@angular/forms'
import { Router } from '@angular/router';
import { Candidate } from 'src/app/model/candidate';
@Component({
  selector: 'app-candidate-login',
  templateUrl: './candidate-login.component.html',
  styleUrls: ['./candidate-login.component.css']
})
export class CandidateLoginComponent implements OnInit {

  // candidateobj:Candidate;
  candidate = new Candidate();
  constructor(private com: CommonService,private route:Router) { }

  logincandidate:NgForm;

 

  ngOnInit(): void {
  }

candidateLogin(){
    this.com.logincandidatefromServer(this.candidate).subscribe
    (
      (data)=>{
        console.log('response');
        console.log('username'+this.candidate.username)
        console.log('password'+this.candidate.cpassword)
        alert('Login Successful')
        this.route.navigate(['/candidate-login/jobheader']);
      }
      
      
    )
  }
}

