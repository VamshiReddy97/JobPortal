import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminLoginComponent } from './admin/admin/admin-login/admin-login.component';
import { RegisterAdminComponent } from './admin/admin/register-admin/register-admin.component';
import { AppComponent } from './app.component';
import { AddCanEmpHisComponent } from './can-employment-his/can-employment-his/add-can-emp-his/add-can-emp-his.component';
import { CandidateListComponent } from './candidate/candidate/candidate-list/candidate-list.component';
import { CandidateLoginComponent } from './candidate/candidate/candidate-login/candidate-login.component';
import { CandidateRegComponent } from './candidate/candidate/candidate-reg/candidate-reg.component';
import { EmployerListComponent } from './employer/employer/employer-list/employer-list.component';
import { EmployerLoginComponent } from './employer/employer/employer-login/employer-login.component';
import { EmployerRegComponent } from './employer/employer/employer-reg/employer-reg.component';
import { empheaderroutes } from './employerheader/employerheader/employerheader-routing.module';
import { EmployerheaderModule } from './employerheader/employerheader/employerheader.module';

import { EmployerheaderComponent } from './employerheader/employerheader/employerheader/employerheader.component';
import { headerroutes } from './header/header/header-routing.module';
import { HeaderComponent } from './header/header/header/header.component';
import { HomePageComponent } from './home/home/home-page/home-page.component';
import { headroute } from './job-application/job-application/job-application-routing.module';
import { JobApplicationComponent } from './job-application/job-application/job-application/job-application.component';
import { JobListComponent } from './job/job/job-list/job-list.component';
import { headerrou } from './job/job/job-routing.module';
import { PostJobComponent } from './job/job/post-job/post-job.component';
import { jobheaderroute } from './jobheader/jobheader/jobheader-routing.module';
import { JobheaderComponent } from './jobheader/jobheader/jobheader/jobheader.component';

const routes: Routes = [
  {path:"app",component:AppComponent},
  {path:"home-page",component:HomePageComponent},
  {path:"admin-login",component:AdminLoginComponent},
  {path:"register-admin",component:RegisterAdminComponent},
  {path:"candidate-list",component:CandidateListComponent},
  {path:"admin-login/candidate-list",component:CandidateListComponent},
  {path:"candidate-login",component:CandidateLoginComponent},
  {path:"job-list",component:JobListComponent},
  {
    path:"candidate-login/jobheader",
    component:JobheaderComponent,
    children:jobheaderroute
  },
  {path:"candidate-reg",component:CandidateRegComponent},
  {path:"post-job",component:PostJobComponent},
  {path:"employer-login",component:EmployerLoginComponent},
  {
    path:"employer-login",
    loadChildren: () => EmployerheaderModule
  },
  {path:"employer-reg",component:EmployerRegComponent},
  {path:"employer-list",component:EmployerListComponent},
  {
    path:"job-application",component:JobApplicationComponent
  },
  {
    path:"admin-login/header",
    component:HeaderComponent,
    children:headerroutes
  },

  {
   path:"candidate-login/job-list",
  component:JobListComponent,
  children:headroute
  },
  {
    path:'add-can-emp-his',
    component:AddCanEmpHisComponent

  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes),],
  exports: [RouterModule]
})
export class AppRoutingModule { }
