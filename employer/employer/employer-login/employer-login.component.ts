import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Employer } from 'src/app/model/employer';
import { CommonService } from 'src/app/shared/common.service';

@Component({
  selector: 'app-employer-login',
  templateUrl: './employer-login.component.html',
  styleUrls: ['./employer-login.component.css']
})
export class 
EmployerLoginComponent implements OnInit {

  employer = new Employer();
  constructor(private serv : CommonService,private rou :Router) {
    
   }
   loginEmployer :NgForm;
  ngOnInit(): void {

  }

  employerLogin(){
    this.serv.loginemployerFromServer(this.employer).subscribe(
      (data)=>{
      console.log('response');
      this.rou.navigate(['/employer-login/employerheader']);
    })
  }

  

}

