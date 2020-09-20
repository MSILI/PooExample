package fr.app.model;

import java.util.List;
import java.util.Objects;

public class Enseignant extends Personne {

    private GradeEnum grade;

    public Enseignant(GradeEnum grade) {
        this.grade = grade;
    }

    public Enseignant(String matricule, String nom, String prenom, int age, GradeEnum grade) {
        super(matricule, nom, prenom, age);
        this.grade = grade;
    }

    public Enseignant(String matricule, String nom, String prenom, int age, List<Cours> coursList, GradeEnum grade) {
        super(matricule, nom, prenom, age, coursList);
        this.grade = grade;
    }

    public GradeEnum getGrade() {
        return grade;
    }

    public void setGrade(GradeEnum grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enseignant that = (Enseignant) o;
        return grade == that.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade);
    }
}
