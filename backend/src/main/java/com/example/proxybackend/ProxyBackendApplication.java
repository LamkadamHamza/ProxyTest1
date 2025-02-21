package com.example.proxybackend;

import com.example.proxybackend.dao.EtudiantRepository;
import com.example.proxybackend.entities.Etudient;
import com.example.proxybackend.service.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication

public class ProxyBackendApplication {

   EtudiantRepository etudiantRepository;

  public ProxyBackendApplication(EtudiantRepository etudiantRepository) {
    this.etudiantRepository = etudiantRepository;
  }

  public static void main(String[] args) {

    SpringApplication.run(ProxyBackendApplication.class, args);



  }


  @Bean
  CommandLineRunner start() {
    return args -> {

      etudiantRepository.save(new Etudient(1l,"hamza","lamkadam", new Date()));
      etudiantRepository.save(new Etudient(2l,"imane","souaidi", new Date()));
    };
  }

}
