import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employer } from 'src/app/model/employer';
import { Job } from 'src/app/model/job';
import { CommonService } from 'src/app/shared/common.service';

@Component({
  selector: 'app-job-list',
  templateUrl: './job-list.component.html',
  styleUrls: ['./job-list.component.css']
})
export class JobListComponent implements OnInit {
  [x: string]: any;
  employer:Employer;
  jobs:Job[];

  constructor(private service :CommonService,private route:Router) { }

  ngOnInit(): void {
    this.service.listJobs().subscribe(
      data=>{
        console.log('Jobs: ' + JSON.stringify(data))
        this.jobs=data}

    )
  }
  applyjob(){
    console.log('in apply job method')
    this.route.navigate(['/job-application'])
//     this.service.getEmployerById(this.employer.id)
// .subscribe(
//   data=>{
//     this.employer= data
//   }
//)    
  }

  searchJob(key:string):void{
    const result :Job[] =[];
    for(const job of this.jobs){
      if(job.job_location.toLowerCase().indexOf(key.toLowerCase())!=-1)
      result.push(job);
    }
    this.jobs= result;
    if(result.length ===0 || !key){
      this.service.listJobs();
      window.location.reload();
    }
  }

}
