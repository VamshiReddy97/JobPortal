import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Employer } from 'src/app/model/employer';
import { CommonService } from 'src/app/shared/common.service';

@Component({
  selector: 'app-employer-reg',
  templateUrl: './employer-reg.component.html',
  styleUrls: ['./employer-reg.component.css']
})
export class EmployerRegComponent implements OnInit {
  registerEmployer:FormGroup;
  employerobj:Employer

  constructor(public cs:CommonService,private locat: Location,private fb:FormBuilder) {

    this.employerobj = new Employer();

     this.registerEmployer = new FormGroup({
       employer_name:new FormControl('',Validators.required),
      emailID: new FormControl('',Validators.required),
       pass:new FormControl('',Validators.required),
       employer_address: new FormControl('',Validators.required),
       employer_city:new FormControl('',Validators.required),
      status:new FormControl('',Validators.required)

     })
   }

  
  ngOnInit(): void {
this.registerEmployer = this.fb.group({
  id:[],
  employer_name:[''],
  emailID:[''],
  pass:[''],
  employer_address:[''],
  employer_city:[''],
  status:false
})

  }

  saveEmployer(){
    if(this.registerEmployer.valid)
    {
      const employer = this.registerEmployer.value;
      var formdata = new FormData();
      formdata.append('employer',JSON.stringify(employer));
      this.cs.saveEmployerProfile(formdata).subscribe(
        (response: any)=>
        {console.log(response);}
      )
      
    }else{
      this.registerEmployer.value;
    }      
   
    this.registerEmployer.reset();
  }

  // addEmployer(employer:Employer){
  //   this.cs.saveEmployerData(employer).subscribe();
  //   console.log('registered successfully');
  //   window.location.reload();
  // }
  onSubmit(){}
  }
