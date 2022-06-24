package com.example.projetdevops2.User;

import javax.persistence.*;

@Entity
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private long id;
    public String mail;
    public String motdepasse;
    public String nom;
    public String prenom;
    public String Numero_Nom;

    public User(String mail, String motdepasse, String nom, String prenom, String numero_Nom) {
        this.mail = mail;
        this.motdepasse = motdepasse;
        this.nom = nom;
        this.prenom = prenom;
        Numero_Nom = numero_Nom;
    }

    public User() {

    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

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

    public String getNumero_Nom() {
        return Numero_Nom;
    }

    public void setNumero_Nom(String numero_Nom) {
        Numero_Nom = numero_Nom;
    }


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
