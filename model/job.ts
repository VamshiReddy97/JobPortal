import { Employer } from "./employer";

export class Job {

    jobId:number;
    job_title:string;
    job_skills:string;
    job_post_date:Date;
   // job_last_date:Date;
    job_description:string;
    job_exp_years:number;
    job_exp_month:number;
    job_location:string;
    last_date_apply:Date;
    employer:Employer;
    
}
