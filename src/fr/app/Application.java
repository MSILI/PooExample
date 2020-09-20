package fr.app;

import fr.app.dao.EtudiantDao;
import fr.app.dao.EtudiantDaoImpl;
import fr.app.model.Etudiant;
import fr.app.model.NiveauEnum;

public class Application {

    public static void main(String[] args) {
        EtudiantDao etudiantDao = new EtudiantDaoImpl();
        Etudiant etudiant = new Etudiant("M2-123456", "BENHACINE", "Mourad", 28, NiveauEnum.M2);
        etudiantDao.add(etudiant);
        System.out.println("finAll = " + etudiantDao.findAll());
        Etudiant foundEtudiant = etudiantDao.findByMatricule("M2-123456");
        System.out.println("findByMatricule M2-123456 = " + foundEtudiant);
        etudiantDao.update("M2-123456", new Etudiant("M2-123456", "MSILI", "Fatah", 27, NiveauEnum.M1));
        System.out.println("findByMatricule M2-12345 = " + etudiantDao.findByMatricule("M2-123456"));
        etudiantDao.deleteByMatricule("M2-123456");
        System.out.println("finAll = " + etudiantDao.findAll());

    }
}
