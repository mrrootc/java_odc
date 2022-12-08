package org.example;

public class Personne {
    private String nom;
    private String prenom;
    private int age;

    public Personne (String nom, String prenom, int age){
      this.nom = nom;
     this.prenom =   prenom ;
     this.age =         age ;
    }


    public String getNom(){
        return this.nom;
    }
    private String setNom(String nom){
        nom = this.nom;
        return nom;
    }
    private String getPrenom(){
        return this.prenom;
    }
    private String setPrenom(String prenom){
        prenom = this.prenom;
        return prenom;
    }
    private int getAge(){
        return this.age;
    }
    private int setAge(int age){
        age = this.age;
        return age;
    }
}
