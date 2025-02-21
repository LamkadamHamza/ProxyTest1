package com.example.proxybackend.service;

import com.example.proxybackend.dao.EtudiantRepository;
import com.example.proxybackend.entities.Etudient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LamkadamHamza
 **/

@Service

public class EtudiantServiceImpl implements  EtudiantService{

   EtudiantRepository  etudiantRepository;

  public EtudiantServiceImpl(EtudiantRepository etudiantRepository) {
    this.etudiantRepository = etudiantRepository;
  }

  @Override
  public Etudient SaveEtudiant(Etudient e) {
    Etudient etudiant = etudiantRepository.save(e);
    return etudiant;
  }

  @Override
  public List<Etudient> getAllEtudiant() {
    List<Etudient> ListEtudiants = etudiantRepository.findAll();
    return ListEtudiants;
  }

  @Override
  public Etudient getEtudiantByid(Long id) {
    Etudient etudiant = etudiantRepository.findById(id).orElse(null);
    return etudiant;
  }

  @Override
  public void deleteEtudiant(Long id) {

  }
}
