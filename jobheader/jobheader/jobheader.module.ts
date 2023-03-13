import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { JobheaderRoutingModule } from './jobheader-routing.module';
import { JobheaderComponent } from './jobheader/jobheader.component';


@NgModule({
  declarations: [
    JobheaderComponent
  ],
  imports: [
    CommonModule,
    JobheaderRoutingModule
  ]
})
export class JobheaderModule { }
