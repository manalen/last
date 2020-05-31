package com.example.demo.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

import java.util.Date;

@Entity
        @Table(name = " Prescriptions")


public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idpres ;
    private String medicament_prescrit;
    private Date date_debut_traitement ;
    private Date date_fin_traitement ;
    private String motif_pres ;



    public int getIdpres() {
        return idpres;
    }

    public void setIdpres(int idpres) {
        this.idpres = idpres;
    }

    public String getMedicament_prescrit() {
        return medicament_prescrit;
    }

    public void setMedicament_prescrit(String medicament_prescrit) {
        this.medicament_prescrit = medicament_prescrit;
    }

    public Date getDate_debut_traitement() {
        return date_debut_traitement;
    }

    public void setDate_debut_traitement(Date date_debut_traitement) {
        this.date_debut_traitement = date_debut_traitement;
    }

    public Date getDate_fin_traitement() {
        return date_fin_traitement;
    }

    public void setDate_fin_traitement(Date date_fin_traitement) {
        this.date_fin_traitement = date_fin_traitement;
    }

    public String getMotif_pres() {
        return motif_pres;
    }

    public void setMotif_pres(String motif_pres) {
        this.motif_pres = motif_pres;
    }


    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "medecin_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Medecin medecin ;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "patient_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Patient patient;
}
