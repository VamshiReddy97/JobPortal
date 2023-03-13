import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddCanEmpHisComponent } from './add-can-emp-his.component';

describe('AddCanEmpHisComponent', () => {
  let component: AddCanEmpHisComponent;
  let fixture: ComponentFixture<AddCanEmpHisComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddCanEmpHisComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddCanEmpHisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
