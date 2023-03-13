import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddCanEmpHisComponent } from 'src/app/can-employment-his/can-employment-his/add-can-emp-his/add-can-emp-his.component';
import { headerrou } from 'src/app/job/job/job-routing.module';
import { JobsAppliedComponent } from 'src/app/job-application/job-application/jobs-applied/jobs-applied.component';
import { PostJobComponent } from 'src/app/job/job/post-job/post-job.component';
import { EmployerheaderComponent } from './employerheader/employerheader.component';
import { headroute } from 'src/app/job-application/job-application/job-application-routing.module';

export const empheaderroutes: Routes = [
  {
    path:'employerheader',
    component:EmployerheaderComponent,
    children:headerrou
  },
  {
  
          path:'add-can-emp-his',
    component:AddCanEmpHisComponent
    }
  ,
  {
    path:'employerheader',
    component:EmployerheaderComponent,
    children:headroute
  }
];

@NgModule({
  imports: [RouterModule.forChild(empheaderroutes)],
  exports: [RouterModule]
})
export class EmployerheaderRoutingModule { }
