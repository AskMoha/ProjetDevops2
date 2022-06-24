package com.example.projetdevops2;

public class Séance {
    public String h_debut;
    public String h_fin;
    public String Date_seance;
    public Promotion Eleves;
    public Matière m;

    public Séance(String h_debut, String h_fin, String date_seance, Promotion eleves, Matière m) {
        this.h_debut = h_debut;
        this.h_fin = h_fin;
        Date_seance = date_seance;
        Eleves = eleves;
        this.m = m;
    }
}
