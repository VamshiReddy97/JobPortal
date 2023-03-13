
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ApplyJobComponent } from './apply-job/apply-job.component';
import { JobApplicationComponent } from './job-application/job-application.component';
import { JobsAppliedComponent } from './jobs-applied/jobs-applied.component';


export const headroute: Routes = [{
    path:'',component:JobApplicationComponent,
    children:[
     {
        path:'apply-job',component:ApplyJobComponent
     } 
    ]
  },
  {
    path:'jobs-applied',
    component:JobsAppliedComponent
  }
 
];

@NgModule({
  imports: [RouterModule.forChild(headroute)],
  exports: [RouterModule]
})
export class HeaderRoutingModule { }
