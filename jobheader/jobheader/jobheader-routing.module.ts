
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { JobListComponent } from 'src/app/job/job/job-list/job-list.component';
import { PostJobComponent } from 'src/app/job/job/post-job/post-job.component';

export const jobheaderroute: Routes = [
  {
    path:'job-list',
    component:JobListComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(jobheaderroute)],
  exports: [RouterModule]
})
export class JobheaderRoutingModule { }
