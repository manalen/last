package com.example.demo.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Id;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity

@Table(name = " Analyses")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"date_creation "},
        allowGetters = true
)

public class Analyse  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idanalyse;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_creation", nullable = false, updatable = false)
    @CreatedDate
    private Date date_creation;

    private float Glycémie;
    private float Tension;
    private float Choléstérol;
    private float Transaminases;
    private String medecin_traitant;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "patient_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Patient patient ;



    public int getIdanalyse() {
        return idanalyse;
    }

    public void setIdanalyse(int idanalyse) {
        this.idanalyse = idanalyse;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public float getGlycémie() {
        return Glycémie;
    }

    public void setGlycémie(float glycémie) {
        Glycémie = glycémie;
    }

    public float getTension() {
        return Tension;
    }

    public void setTension(float tension) {
        Tension = tension;
    }

    public float getCholéstérol() {
        return Choléstérol;
    }

    public void setCholéstérol(float choléstérol) {
        Choléstérol = choléstérol;
    }

    public float getTransaminases() {
        return Transaminases;
    }

    public void setTransaminases(float transaminases) {
        Transaminases = transaminases;
    }

    public String getMedecin_traitant() {
        return medecin_traitant;
    }

    public void setMedecin_traitant(String medecin_traitant) {
        this.medecin_traitant = medecin_traitant;
    }
}
