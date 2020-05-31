package com.example.demo.repos;

import com.example.demo.classes.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MedecinRepo extends JpaRepository<Medecin, Integer> {
    List<Medecin> findMedByCin(String cin);

    @Query("SELECT u FROM Medecin u WHERE u.nom = :nom and u.prenom = :prenom")
    List<Medecin> findMedByNomandPrenom(
            @Param("nom") String nom,
            @Param("prenom") String prenom);

    List<Medecin> findMedBySpecialite(String specialite);

}
