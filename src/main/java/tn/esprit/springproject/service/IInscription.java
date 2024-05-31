package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.entities.Support;

import java.util.List;

public interface IInscription {
    public Inscription addInscription(Inscription in);

    public Inscription updateInscription(Inscription in);

    public List<Inscription> getAllInscription();


    List<Integer> numWeeksCourseOfInstructorBySupport(Long numMoniteur, Support support);

    public Inscription getInscriptionById (Long numInscription);


    public void deleteInscription (Long numInscription);
    public  Inscription addInscriptionAndAssignToSkieur(Inscription inscription, Long numSk);
    public Inscription addInscriptionAndAssignToCours(Inscription inscription, Long numCours);
}
