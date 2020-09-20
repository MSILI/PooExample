package fr.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Personne {

    private String matricule;
    private String nom;
    private String prenom;
    private int age;
    private List<Cours> coursList = new ArrayList<>();

    public Personne() {
    }

    public Personne(String matricule, String nom, String prenom, int age) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Personne(String matricule, String nom, String prenom, int age, List<Cours> coursList) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.coursList = coursList;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Cours> getCoursList() {
        return coursList;
    }

    public void setCoursList(List<Cours> coursList) {
        this.coursList = coursList;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", coursList=" + coursList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return Objects.equals(matricule, personne.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule);
    }
}
