import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { JobApplicationComponent } from './job-application/job-application.component';
import { ApplyJobComponent } from './apply-job/apply-job.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    JobApplicationComponent,
    ApplyJobComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class JobApplicationModule { }
