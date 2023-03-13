import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CanEmpHistoryComponent } from './can-emp-history.component';

describe('CanEmpHistoryComponent', () => {
  let component: CanEmpHistoryComponent;
  let fixture: ComponentFixture<CanEmpHistoryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CanEmpHistoryComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CanEmpHistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
