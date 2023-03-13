import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JobheaderComponent } from './jobheader.component';

describe('JobheaderComponent', () => {
  let component: JobheaderComponent;
  let fixture: ComponentFixture<JobheaderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ JobheaderComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(JobheaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
