package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.TypeAbonnement;
import tn.esprit.springproject.repository.AbonnementRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class AbonnementServiceImp implements IAbonnement{

    private AbonnementRepository abr;
    @Override
    public Abonnement addAbonnement(Abonnement ab) {
        return abr.save(ab);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement ab) {
        return abr.save(ab);
    }

    @Override
    public List<Abonnement> getAllAbonnement() {
        return abr.findAll();
    }



    @Override
    public Abonnement getAbById(Long numAbon) {
        return abr.findById(numAbon).orElse(null);
    }

    @Override
    public void deleteAbonnement(Long numAbon) {

    }

    @Override
    public List<Abonnement> listeAbonnements(TypeAbonnement typeAbonnement) {
        return abr.findByTypeAbon(typeAbonnement);
    }
}
