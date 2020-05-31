package com.example.demo.repos;

import com.example.demo.classes.Admin;
import com.example.demo.classes.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepo  extends JpaRepository<Patient, Integer> {
    List<Patient> findByCin(String cin);

    List<Patient> findByNumserie(int numserie);



    List<Patient> findByNom(String nom);

    @Query("SELECT u FROM Patient u WHERE u.nom = :nom and u.prenom = :prenom")
    List<Patient> findPatientByNomandPrenom(
            @Param("nom") String nom,
            @Param("prenom") String prenom);

}
