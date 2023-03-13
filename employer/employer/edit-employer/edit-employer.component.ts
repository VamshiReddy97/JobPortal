import { Component, OnInit } from '@angular/core';
import { CommonService } from 'src/app/shared/common.service';

@Component({
  selector: 'app-edit-employer',
  templateUrl: './edit-employer.component.html',
  styleUrls: ['./edit-employer.component.css']
})
export class EditEmployerComponent implements OnInit {

  constructor(private editserv:CommonService) { }

  ngOnInit(): void {
  }

}
