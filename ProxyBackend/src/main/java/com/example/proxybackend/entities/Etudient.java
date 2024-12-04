package com.example.proxybackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

/**
 * @author LamkadamHamza
 **/
@Entity

public class Etudient {


  public Etudient(Long idEtudiant, String nomEtudiant, String prenomEtudiant, Date dateNais) {
    this.idEtudiant = idEtudiant;
    this.nomEtudiant = nomEtudiant;
    this.prenomEtudiant = prenomEtudiant;
    this.dateNais = dateNais;
  }

  public Etudient() {
  }

  @Id
  private Long idEtudiant;
  private String nomEtudiant;
  private String prenomEtudiant;
  private Date dateNais;


  public Long getIdEtudiant() {
    return idEtudiant;
  }

  public void setIdEtudiant(Long idEtudiant) {
    this.idEtudiant = idEtudiant;
  }

  public String getNomEtudiant() {
    return nomEtudiant;
  }

  public void setNomEtudiant(String nomEtudiant) {
    this.nomEtudiant = nomEtudiant;
  }

  public String getPrenomEtudiant() {
    return prenomEtudiant;
  }

  public void setPrenomEtudiant(String prenomEtudiant) {
    this.prenomEtudiant = prenomEtudiant;
  }

  public Date getDateNais() {
    return dateNais;
  }

  public void setDateNais(Date dateNais) {
    this.dateNais = dateNais;
  }
}
