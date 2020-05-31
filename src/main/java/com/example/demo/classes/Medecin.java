package com.example.demo.classes;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = " Medecins")

public class Medecin extends Utilisateur {
    @Id
    @GeneratedValue
    private int id;
// voila un  commentaire

    public int getIdmedecin() {
        return id;
    }

    public void setIdmedecin(int idmedecin) {
        this.id = idmedecin;
    }



    private String spécialité;




    public String getSpécialité() {
        return spécialité;
    }

    public void setSpécialité(String spécialité) {
        this.spécialité = spécialité;
    }
}
