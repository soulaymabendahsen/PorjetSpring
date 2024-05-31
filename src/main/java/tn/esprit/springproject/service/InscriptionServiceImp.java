package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.entities.Support;
import tn.esprit.springproject.repository.InscriptionRepository;
import tn.esprit.springproject.repository.SkieurRepository;
import tn.esprit.springproject.repository.CoursRepository;
import java.util.List;
import tn.esprit.springproject.entities.SKieur;
import tn.esprit.springproject.entities.Cours;

@Service
@AllArgsConstructor
public class InscriptionServiceImp implements IInscription {
    private InscriptionRepository inscriptionRepository;
    private SkieurRepository skieurRepository;
    private CoursRepository coursRepository;

    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public List<Inscription> getAllInscription() {
        return inscriptionRepository.findAll();
    }

    @Override
    public List<Integer> numWeeksCourseOfInstructorBySupport(Long numMoniteur, Support support) {
        return inscriptionRepository.numWeeksCourseOfInstructorBySupport(numMoniteur,support);
    }

    @Override
    public Inscription getInscriptionById(Long numInscription) {
        return inscriptionRepository.findById(numInscription).orElse(null);
    }

    @Override
    public void deleteInscription(Long numInscription) {
        inscriptionRepository.deleteById(numInscription);
    }

    @Override
    public Inscription addInscriptionAndAssignToSkieur(Inscription inscription, Long numSk) {
        SKieur skieur = skieurRepository.findById(numSk).orElse(null);
        inscription.setSkieur(skieur);
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription addInscriptionAndAssignToCours(Inscription inscription, Long numCours) {
        Cours cours = coursRepository.findById(numCours).orElse(null);
        inscription.setCours(cours);
        return inscriptionRepository.save(inscription);
    }

}