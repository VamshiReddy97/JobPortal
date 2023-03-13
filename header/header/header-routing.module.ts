
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CanEmpHistoryComponent } from 'src/app/can-emploment-his/can-employment-his/can-emp-history/can-emp-history.component';
import { CandidateListComponent } from 'src/app/candidate/candidate/candidate-list/candidate-list.component';
import { EditEmployerComponent } from 'src/app/employer/employer/edit-employer/edit-employer.component';
//import { EditEmployerComponent } from 'src/app/employer/employer/edit-employer/edit-employer.component';
import { EmployerListComponent } from 'src/app/employer/employer/employer-list/employer-list.component';
import { EmployerRoutingModule, emrou } from 'src/app/employer/employer/employer-routing.module';
import { headerrou } from 'src/app/job/job/job-routing.module';
//import { EmployerRoutingModule } from 'src/app/employer/employer/employer-routing.module';

export const headerroutes: Routes = [
  {
    path:'candidate-list',component:CandidateListComponent
  }
  ,
  {
    path:'employer-list',
    component:EmployerListComponent,
    children:headerrou
  }
  ,
  {
    path:'can-emp-history',component:CanEmpHistoryComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(headerroutes)],
  exports: [RouterModule]
})
export class HeaderRoutingModule { }
