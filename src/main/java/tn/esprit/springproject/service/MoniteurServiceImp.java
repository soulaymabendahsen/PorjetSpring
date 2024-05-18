package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Cours;
import tn.esprit.springproject.entities.Moniteur;
import tn.esprit.springproject.repository.CoursRepository;
import tn.esprit.springproject.repository.MoniteurRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class MoniteurServiceImp implements IMoniteur{
    private MoniteurRepository mr;
    private CoursRepository cr;
    @Override
    public Moniteur addMoniteur(Moniteur mon) {
        return mr.save(mon);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur mon) {
        return mr.save(mon);
    }

    @Override
    public List<Moniteur> getAllMoniteur() {
        return mr.findAll();
    }

    @Override
    public Moniteur getMoniteurById(Long numMoniteur) {
        return mr.findById(numMoniteur).orElse(null);
    }

    @Override
    public void deleteMoniteur(Long numMoniteur) {
        mr.deleteById(numMoniteur);

    }

    @Override
    public Moniteur addMoniteurAndAssignToCours(Moniteur moniteur, Long numC) {

        Cours cours = cr.findById(numC).orElse(null);

        Set<Cours> listeCours = new HashSet<>();
        listeCours.add(cours);
        moniteur.setCours(listeCours);
        mr.save(moniteur);
        return mr.save(moniteur);
    }
}
