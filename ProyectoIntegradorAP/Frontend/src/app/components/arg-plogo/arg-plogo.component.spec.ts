import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ArgPlogoComponent } from './arg-plogo.component';

describe('ArgPlogoComponent', () => {
  let component: ArgPlogoComponent;
  let fixture: ComponentFixture<ArgPlogoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ArgPlogoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ArgPlogoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
