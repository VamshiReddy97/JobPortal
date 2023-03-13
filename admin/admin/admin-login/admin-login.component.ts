import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
//import { Observable } from 'rxjs';
import { Admin } from 'src/app/model/admin';
import { CommonService } from 'src/app/shared/common.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

  admin = new Admin();
  msg ='';
  

  constructor(private common : CommonService,private route :Router) { }


  loginadmin: NgForm;
  ngOnInit(): void {
    
  }

  adminLogin(){
    this.common.loginadminfromserver(this.admin).subscribe(
      (data)=>{
        console.log('response');
        this.route.navigate(['/admin-login/header']);
      }
      )
      
    
  }

}
