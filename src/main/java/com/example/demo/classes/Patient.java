package com.example.demo.classes;


import javax.persistence.*;

@Entity
        @Table(name = " Patients")

public class Patient extends Utilisateur {
    @Id
    @GeneratedValue
    private int idpatient;

    public int getIdpatient() {
        return idpatient;
    }

    public void setIdpatient(int idpatient) {
        this.idpatient = idpatient;
    }

    private String Adresse;
    private long Age;
    private int numserie;
    private String cin;



    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public long getAge() {
        return Age;
    }

    public void setAge(long age) {
        Age = age;
    }

    public int getNumserie() {
        return numserie;
    }

    public void setNumserie(int numserie) {
        this.numserie = numserie;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}
