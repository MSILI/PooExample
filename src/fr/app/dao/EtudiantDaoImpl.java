package fr.app.dao;

import fr.app.DataUtils;
import fr.app.model.Etudiant;

import java.util.List;

public class EtudiantDaoImpl implements EtudiantDao {

    @Override
    public List<Etudiant> findAll() {
        return DataUtils.getEtudiantList();
    }

    @Override
    public Etudiant findByMatricule(String matricule) {
        for (Etudiant etudiant : findAll()) {
            if (etudiant.getMatricule().equals(matricule)) {
                return etudiant;
            }
        }
        return null;
    }

    @Override
    public void add(Etudiant etudiant) {
        DataUtils.getEtudiantList()
                .add(etudiant);
    }

    @Override
    public void update(String matricule, Etudiant etudiant) {
        int index = indexOf(etudiant);
        List<Etudiant> etudiantList = findAll();
        if(index != -1) {
            etudiantList.set(index, etudiant);
        } else {
            throw new RuntimeException("Aucun etudiant n'a été trouvé avec la matricule " + matricule);
        }
    }

    @Override
    public void deleteByMatricule(String matricule) {
        Etudiant etudiant = findByMatricule(matricule);
        if(etudiant != null) {
            findAll().remove(indexOf(etudiant));
        } else {
            throw new RuntimeException("Aucun etudiant n'a été trouvé avec la matricule " + matricule);
        }
    }

    private int indexOf(Etudiant etudiant) {
        List<Etudiant> etudiantList = findAll();
        for (int i = 0; i < etudiantList.size(); i++) {
            if (etudiant.getMatricule().equals(etudiantList.get(i).getMatricule())) {
                return i;
            }
        }
        return -1;
    }
}
