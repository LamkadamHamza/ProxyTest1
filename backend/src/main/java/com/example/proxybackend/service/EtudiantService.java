package com.example.proxybackend.service;

import com.example.proxybackend.entities.Etudient;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LamkadamHamza
 **/

@Service
public interface EtudiantService {


  Etudient SaveEtudiant (Etudient e);
  List<Etudient> getAllEtudiant();

  Etudient  getEtudiantByid (Long id );

  public  void deleteEtudiant(Long id);
}
