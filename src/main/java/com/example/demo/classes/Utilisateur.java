package com.example.demo.classes;

import javax.persistence.Id;

import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class Utilisateur {


    private String nom;
    private String prenom;
    private String login;
    private String mdp;




    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
