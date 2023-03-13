import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Employer } from 'src/app/model/employer';
import { CommonService } from 'src/app/shared/common.service';

@Component({
  selector: 'app-employer-list',
  templateUrl: './employer-list.component.html',
  styleUrls: ['./employer-list.component.css']
})
export class EmployerListComponent implements OnInit {


  employers:Employer[];

  employerToUpdate = {
    id:0,
    employer_name:"",
    employer_address:"",
    emailID:"",
    employer_city:"",
    pass:"",
    status:false

  };

  constructor(private ser : CommonService,private location:Location) { }

  ngOnInit(): void {
    this.ser.listemployers().subscribe
    (data=>{this.employers= data})
  }

  deleteemp(id:number){
    this.ser.deleteEmployer(id)
    .subscribe(data=>{
      this.employers = this.employers.filter(employer => employer.id=id);
    })
    window.location.reload();
  }
  edit(employer: Employer) {
    this.employerToUpdate = employer;
    }
  

  updateEmployer()
  {
    this.ser.updateEmployer(this.employerToUpdate).subscribe(
      (response)=> {
        console.log(response);
      }
    )
    window.location.reload;
  }

  }

  


