package com.example.demo.repos;

import com.example.demo.classes.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MedecinRepo extends JpaRepository<Medecin, Integer> {


}