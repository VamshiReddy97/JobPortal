import { HttpClient } from '@angular/common/http';
import { ReturnStatement } from '@angular/compiler';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Admin } from '../model/admin';
import { Candidate } from '../model/candidate';
import { Canemphistory } from '../model/canemphistory';
import { Employer } from '../model/employer';
import { Job } from '../model/job';
import { JobApplication } from '../model/jobapplication';
@Injectable({
  providedIn: 'root'
})
export class CommonService {
 
 
 employers:Employer[];
 
 

  constructor(private http : HttpClient,private router:Router) {}


  e : Employer = {
    id:0,
    employer_name:'',
    emailID:'',
    employer_address:'',
    employer_city:'',
    pass:'',
    status:true
   };
  

   public loginemployerFromServer(employer :Employer):Observable<any> {
    return this.http.post<any>("http://localhost:8080/otw/api/loginEmp",employer);
  }

   public logincandidatefromServer(candidate: Candidate):Observable<any> {
    return this.http.post<any>("http://localhost:8080/otw/api/logincan",candidate);
  }

   public loginadminfromserver(admin:Admin):Observable<any>{
    return this.http.post<any>("http://localhost:8080/otw/api/login",admin);
  }
  saveEmployerData(employer: Employer):Observable<Employer> {
    return this.http.post<Employer>("http://localhost:8080/otw/api/regemployer",employer)
  }

   saveAdminProfile(formdata:FormData):Observable<any>{
    return this.http.post('http://localhost:8080/otw/api/regAdmin',formdata);
   }

   saveCandidateProfile(formdata:FormData):Observable<any>{
    return this.http.post('http://localhost:8080/otw/api/regCan',formdata);
   }

   saveCandidateProfileToServer(formdata:FormData):Observable<any>{
    return this.http.post('http://localhost:8080/otw/api/regCanToServer',formdata);
   }
   
   saveEmployerProfile(formdata:FormData):Observable<any>{
    return this.http.post('http://localhost:8080/otw/api/regEmp',formdata);
   }


   postJob(formdata:FormData):Observable<any>{
    return this.http.post('http://localhost:8080/otw/api/',formdata);
   }
   listCandidate():Observable<Candidate[]>{
    return this.http.get<Candidate[]>('http://localhost:8080/otw/api/allcandidates');
   }

  listemployers():Observable<Employer[]>{
    return this.http.get<Employer[]>('http://localhost:8080/otw/api/allemployers');
  }

  listJobs():Observable<Job[]>{
    return this.http.get<Job[]>('http://localhost:8080/otw/api/alljobs');
  }

  listCEH():Observable<Canemphistory[]>{
    return this.http.get<Canemphistory[]>('http://localhost:8080/otw/api/getceh');
  }

  logout(){
    this.router.navigate(['']);
  }

  downloadCV(){
    this.http.get('http://localhost:8080/otw/api/')
  }

  deleteCandidate(candidateId:number):Observable<any>{
    return this.http.delete<any>('http://localhost:8080/otw/api/deletecan/'+candidateId);
  }

  deleteEmployer(id:number):Observable<any>{
    return this.http.delete<any>('http://localhost:8080/otw/api/delete/'+id);
  }

  public savJob(job:Job){
return this.http.post<any>('http://localhost:8080/otw/api/addjob',job);
  }

  getEmployerDropdownValues():Observable<any>
  {
    return this.http.get<Employer[]>('http://localhost:8080/otw/api/allemployers');
  }
  updateEmployer(employer: Employer):Observable<any>{
    return this.http.put<Employer>('http://localhost:8080/otw/api/update',employer);
  }
  postJobdetails(job:Job):Observable<Job>{
    return this.http.post<Job>('http://localhost:8080/otw/api/postjob',job)
  }

  applyForJob(jobapplication: JobApplication):Observable<JobApplication> {
    return this.http.post<JobApplication>('http://localhost:8080/otw/api/applyjob',jobapplication)
  }

  getallCandidate():Observable<Candidate[]>{
    return this.http.get<Candidate[]>('http://localhost:8080/otw/api/allcan');
   }

   getEmployerById(id:number):Observable<Employer>{
    return this.http.get<Employer>('http://localhost:8080/otw/api/employer'+id)
   }
   getAllApplication():Observable<JobApplication[]> {
    return this.http.get<JobApplication[]>('http://localhost:8080/otw/api/alljobapplication');
  }

  getCandidateById(candidateId:number){
    return this.http.get<Candidate>('http://localhost:8080/otw/api/getCandidateById/'+candidateId);
  }
}
