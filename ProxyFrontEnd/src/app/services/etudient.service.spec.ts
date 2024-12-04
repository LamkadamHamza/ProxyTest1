import { TestBed } from '@angular/core/testing';

import { EtudientService } from './etudient.service';

describe('EtudientService', () => {
  let service: EtudientService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EtudientService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
