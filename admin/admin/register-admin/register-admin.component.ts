import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators  } from '@angular/forms';
import { Admin } from 'src/app/model/admin';
import { CommonService } from 'src/app/shared/common.service';

@Component({
  selector: 'app-register-admin',
  templateUrl: './register-admin.component.html',
  styleUrls: ['./register-admin.component.css']
})
export class RegisterAdminComponent implements OnInit {
  registerAdmin:FormGroup
adminobj:Admin;

  constructor(private common :CommonService,private loc: Location) {
    this.adminobj= new Admin();

    this.registerAdmin = new FormGroup({
admin_id:new FormControl('',Validators.required),
      admin_name: new FormControl('',[Validators.required]),
      emailId:new FormControl('',[Validators.required]),
      username:new FormControl('',[Validators.required]),
      password:new FormControl('',[Validators.required])
    })
   }

  ngOnInit(): void {
  }

  saveAdmin(){
    if(this.registerAdmin.valid)
    {
      const admin = this.registerAdmin.value;
      var formdata = new FormData();
      formdata.append('admin',JSON.stringify(admin));
      this.common.saveAdminProfile(formdata).subscribe(
        (response: any)=>
        {console.log(response);}
      )
      
    }else{
      this.registerAdmin.value;
    }      
   
    this.loc.back();
  }
}
