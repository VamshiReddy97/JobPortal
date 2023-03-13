import { Candidate } from "./candidate";
import { Employer } from "./employer";

export class Admin {
    admin_id:number;
    admin_name:string;
    emailId:string;
    username:string;
    password:string;
    candidate:Candidate;
    employer:Employer;
}
