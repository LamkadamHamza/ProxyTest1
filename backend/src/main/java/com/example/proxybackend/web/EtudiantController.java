package com.example.proxybackend.web;

import com.example.proxybackend.entities.Etudient;
import com.example.proxybackend.service.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LamkadamHamza
 **/
@RestController
@RequestMapping("/Etudiant")
@CrossOrigin
public class EtudiantController {

   EtudiantService etudiantService;

  public EtudiantController(EtudiantService etudiantService) {
    this.etudiantService = etudiantService;
  }

  @PostMapping(path="/ListeEtudiants",produces= {MediaType.APPLICATION_JSON_VALUE})
  public Etudient saveEtudient(@RequestBody Etudient e){

    return etudiantService.SaveEtudiant(e);
  }

  @GetMapping(path="/liste",produces= {MediaType.APPLICATION_JSON_VALUE})
  public List<Etudient> getAllEtudiant(){
    return  etudiantService.getAllEtudiant();
  }

  @GetMapping(path="/ListeEtudiants/{id}",produces= {MediaType.APPLICATION_JSON_VALUE})
  public Etudient findEtudiantById(@PathVariable(value="id") Long id){
    return  etudiantService.getEtudiantByid(id);
  }

}
