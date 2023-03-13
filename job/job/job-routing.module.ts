
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddCanEmpHisComponent } from 'src/app/can-employment-his/can-employment-his/add-can-emp-his/add-can-emp-his.component';
import { headroute } from 'src/app/job-application/job-application/job-application-routing.module';
import { JobListComponent } from './job-list/job-list.component';
import { JobsAppliedComponent } from '../../job-application/job-application/jobs-applied/jobs-applied.component';
import { PostJobComponent } from './post-job/post-job.component';



export const headerrou: Routes = [
 {
   path:'post-job',component:PostJobComponent
 }
];

@NgModule({
  imports: [RouterModule.forChild(headerrou)],
  exports: [RouterModule]
})
export class HeaderRoutingModule { }
