import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OneFormationComponent } from './one-formation.component';

describe('OneFormationComponent', () => {
  let component: OneFormationComponent;
  let fixture: ComponentFixture<OneFormationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [OneFormationComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(OneFormationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
