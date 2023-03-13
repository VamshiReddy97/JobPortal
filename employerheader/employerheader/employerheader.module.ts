import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EmployerheaderRoutingModule } from './employerheader-routing.module';
import { EmployerheaderComponent } from './employerheader/employerheader.component';


@NgModule({
  declarations: [
    EmployerheaderComponent
  ],
  imports: [
    CommonModule,
    EmployerheaderRoutingModule
  ]
})
export class EmployerheaderModule { }
