import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmployerRegComponent } from './employer-reg/employer-reg.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { EmployerLoginComponent } from './employer-login/employer-login.component';
import { EmployerListComponent } from './employer-list/employer-list.component';
import { EditEmployerComponent } from './edit-employer/edit-employer.component';



@NgModule({
  declarations: [
    EmployerRegComponent,
    EmployerLoginComponent,
    EmployerListComponent,
    EditEmployerComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class EmployerModule { }
