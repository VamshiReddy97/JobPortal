import { Component, OnInit } from '@angular/core';
import { JobApplication } from 'src/app/model/jobapplication';
import { CommonService } from 'src/app/shared/common.service';

@Component({
  selector: 'app-jobs-applied',
  templateUrl: './jobs-applied.component.html',
  styleUrls: ['./jobs-applied.component.css']
})
export class JobsAppliedComponent implements OnInit {

  jobapplied:JobApplication[];
  constructor(private service :CommonService) { }

  ngOnInit(): void {

    this.service.getAllApplication().subscribe(
      data=>{
        console.log('Jobs: ' + JSON.stringify(data))
        this.jobapplied= data
      }
    )
  }


}
