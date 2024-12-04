package com.example.proxybackend.dao;

import com.example.proxybackend.entities.Etudient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author LamkadamHamza
 **/

@Repository
public interface EtudiantRepository extends JpaRepository<Etudient , Long> {
}
