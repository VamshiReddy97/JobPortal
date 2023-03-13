import { Candidate } from "./candidate";
import { Job } from "./job";

export class JobApplication {
    jobappId:number;
    date_applied:Date;
    msg:string;
    candidate:Candidate;
    job:Job;
}
