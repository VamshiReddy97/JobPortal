import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AdminModule } from './admin/admin/admin.module';
import { HttpClientModule } from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CommonService } from './shared/common.service';
import { CandidateModule } from './candidate/candidate/candidate.module';
import { JobModule } from './job/job/job.module';
import { HomeModule } from './home/home/home.module';
import { EmployerModule } from './employer/employer/employer.module';
import { EmployerRoutingModule } from './employer/employer/employer-routing.module'
import { HeaderModule } from './header/header/header.module';
import { JobApplicationModule } from './job-application/job-application/job-application.module';
import { CanEmploymentHisModule } from './can-emploment-his/can-employment-his/can-employment-his.module';
import { JobheaderModule } from './jobheader/jobheader/jobheader.module';
import { EmployerheaderRoutingModule } from './employerheader/employerheader/employerheader-routing.module';
import { JobheaderRoutingModule } from './jobheader/jobheader/jobheader-routing.module';
import { AddCanEmpHisComponent } from './can-employment-his/can-employment-his/add-can-emp-his/add-can-emp-his.component';
@NgModule({
  declarations: [
    AppComponent,
    AddCanEmpHisComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AdminModule,
    HttpClientModule,
    CandidateModule,
    JobModule,
    HomeModule,
    EmployerModule,
    HeaderModule,
    JobApplicationModule,
    CanEmploymentHisModule,
    EmployerRoutingModule,
    JobheaderModule,
    JobheaderRoutingModule,
    EmployerheaderRoutingModule

  ],
  providers: [CommonService],
  bootstrap: [AppComponent],
  exports:[CandidateModule,
    AdminModule,
    EmployerModule,
    HeaderModule,
    JobheaderModule,
    JobModule,
    JobApplicationModule,
    CanEmploymentHisModule]
})
export class AppModule { }
