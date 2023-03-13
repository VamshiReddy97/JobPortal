import  {NgModule} from '@angular/core'
import { RouterModule, Routes } from '@angular/router'
import { EditEmployerComponent } from './edit-employer/edit-employer.component'
//import { EditEmployerComponent } from './edit-employer/edit-employer.component'
//import { EmployerListComponent } from './employer-list/employer-list.component'


export const emrou : Routes=[
    {
        path:'edit-employer',
        component:EditEmployerComponent
    },
   
]
@NgModule({
    imports:[RouterModule.forChild(emrou)],
    exports:[RouterModule],

})
export class EmployerRoutingModule{}