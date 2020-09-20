package fr.app.model;

import java.util.List;
import java.util.Objects;

public class Etudiant extends Personne {

    private NiveauEnum niveau;

    public Etudiant(NiveauEnum niveau) {
        this.niveau = niveau;
    }

    public Etudiant(String matricule, String nom, String prenom, int age, NiveauEnum niveau) {
        super(matricule, nom, prenom, age);
        this.niveau = niveau;
    }

    public Etudiant(String matricule, String nom, String prenom, int age, List<Cours> coursList, NiveauEnum niveau) {
        super(matricule, nom, prenom, age, coursList);
        this.niveau = niveau;
    }

    public NiveauEnum getNiveau() {
        return niveau;
    }

    public void setNiveau(NiveauEnum niveau) {
        this.niveau = niveau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return niveau == etudiant.niveau;
    }

    @Override
    public int hashCode() {
        return Objects.hash(niveau);
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "matricule=" + this.getMatricule() +
                ", nom=" + this.getNom() +
                ", prenom=" + this.getPrenom() +
                ", age=" + this.getAge() +
                ", niveau=" + niveau +
                '}';
    }
}
