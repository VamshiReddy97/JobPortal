import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CandidateRegComponent } from './candidate-reg/candidate-reg.component';
import { CandidateListComponent } from './candidate-list/candidate-list.component';
import { CandidateLoginComponent } from './candidate-login/candidate-login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ViewCvComponent } from './view-cv/view-cv.component';
@NgModule({
  declarations: [
    CandidateRegComponent,
    CandidateListComponent,
    CandidateLoginComponent,
    ViewCvComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class CandidateModule { }
