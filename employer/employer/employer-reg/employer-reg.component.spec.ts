import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployerRegComponent } from './employer-reg.component';

describe('EmployerRegComponent', () => {
  let component: EmployerRegComponent;
  let fixture: ComponentFixture<EmployerRegComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmployerRegComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployerRegComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
