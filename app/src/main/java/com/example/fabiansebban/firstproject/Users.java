package com.example.fabiansebban.firstproject;

/**
 * Created by fabiansebban on 27/9/16.
 */
public class Users {

    private String nom;
    private String prenom;
    private String email;


    public Users(String nom, String email, String prenom) {
        this.nom = nom;
        this.email = email;
        this.prenom = prenom;
    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
