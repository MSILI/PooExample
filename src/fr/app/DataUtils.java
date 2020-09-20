package fr.app;

import fr.app.model.Cours;
import fr.app.model.Enseignant;
import fr.app.model.Etudiant;

import java.util.ArrayList;
import java.util.List;

public class DataUtils {

    private static List<Etudiant> etudiantList = new ArrayList<>();
    private static List<Enseignant> enseignantList = new ArrayList<>();
    private static List<Cours> coursList = new ArrayList<>();

    public DataUtils() {
    }

    public static List<Etudiant> getEtudiantList() {
        return etudiantList;
    }

    public static List<Enseignant> getEnseignantList() {
        return enseignantList;
    }

    public static List<Cours> getCoursList() {
        return coursList;
    }
}
