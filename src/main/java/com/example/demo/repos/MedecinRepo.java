package com.example.demo.repos;

import com.example.demo.classes.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedecinRepo extends JpaRepository<Medecin, Integer> {


    @Query("SELECT u FROM Medecin u WHERE u.nom = :nom and u.prenom = :prenom")
    List<Medecin> findMedByNomandPrenom(
            @Param("nom") String nom,
            @Param("prenom") String prenom);

    List<Medecin> findMedBySpécialité(String spécialité);

}
