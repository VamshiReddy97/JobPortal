import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Canemphistory } from 'src/app/model/canemphistory';
import { CommonService } from 'src/app/shared/common.service';

@Component({
  selector: 'app-can-emp-history',
  templateUrl: './can-emp-history.component.html',
  styleUrls: ['./can-emp-history.component.css']
})
export class CanEmpHistoryComponent implements OnInit {

  cehs:Canemphistory[];
  constructor(private cehservice: CommonService,private loc :Location) { }

  ngOnInit(): void {

    this.cehservice.listCEH().subscribe(
      (data)=>{this.cehs= data}
    )


  }

}
