import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { RegisterAdminComponent } from './register-admin/register-admin.component';

import {FormsModule,ReactiveFormsModule} from '@angular/forms'

@NgModule({
  declarations: [
    AdminLoginComponent,
    RegisterAdminComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule
    
  ]
})
export class AdminModule { }
