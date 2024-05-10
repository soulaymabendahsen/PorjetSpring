package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Moniteur;
import tn.esprit.springproject.repository.MoniteurRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class MoniteurServiceImp implements IMoniteur{
    private MoniteurRepository mr;
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
}
