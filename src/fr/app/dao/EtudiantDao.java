package fr.app.dao;

import fr.app.model.Etudiant;

import java.util.List;

public interface EtudiantDao {

    List<Etudiant> findAll();

    Etudiant findByMatricule(String matricule);

    void add(Etudiant etudiant);

    void update(String matricule, Etudiant etudiant);

    void deleteByMatricule(String matricule);
}
