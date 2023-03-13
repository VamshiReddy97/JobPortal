import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Candidate } from 'src/app/model/candidate';
import { Job } from 'src/app/model/job';
import { JobApplication } from 'src/app/model/jobapplication';
import { CommonService } from 'src/app/shared/common.service';

@Component({
  selector: 'app-job-application',
  templateUrl: './job-application.component.html',
  styleUrls: ['./job-application.component.css']
})
export class JobApplicationComponent implements OnInit {

  jobapplication:JobApplication

  jobs:Job[]=[];
  candidates:Candidate[]=[];
  constructor(private serv : CommonService,private routers: Router) { 
    this.jobapplication = new JobApplication();


    this.serv.getallCandidate().subscribe(
      data=>{
        this.candidates = data
      }
    )

  this.serv.listJobs().subscribe(
    data=>{
     this.jobs = data
    }
  )
  }
  
  ngOnInit(): void {
  }

  applyjob(){
    this.serv.applyForJob(this.jobapplication)
    .subscribe(
      response=>{
        console.log('job applied')
      }
    )
  }

  
}
