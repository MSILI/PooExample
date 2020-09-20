package fr.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cours {

    private String nom;
    private Enseignant enseignant;
    private List<Etudiant> etudiantList = new ArrayList<>();

    public Cours() {
    }

    public Cours(String nom, Enseignant enseignant) {
        this.nom = nom;
        this.enseignant = enseignant;
    }

    public Cours(String nom, Enseignant enseignant, List<Etudiant> etudiantList) {
        this.nom = nom;
        this.enseignant = enseignant;
        this.etudiantList = etudiantList;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public List<Etudiant> getEtudiantList() {
        return etudiantList;
    }

    public void setEtudiantList(List<Etudiant> etudiantList) {
        this.etudiantList = etudiantList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cours cours = (Cours) o;
        return Objects.equals(nom, cours.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }

    @Override
    public String toString() {
        return "Cours{" +
                "nom='" + nom + '\'' +
                ", enseignant=" + enseignant +
                ", etudiantList=" + etudiantList +
                '}';
    }
}
