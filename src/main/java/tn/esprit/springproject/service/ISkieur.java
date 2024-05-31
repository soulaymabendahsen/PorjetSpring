package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.SKieur;
import tn.esprit.springproject.entities.TypeAbonnement;

import java.util.List;

public interface ISkieur {

    public SKieur addSkieur(SKieur sk);

    public SKieur updateSkieur(SKieur sk);

    public List<SKieur> getAllSkieur();


    public SKieur getSkById (Long numSk);


    public void deleteSkieur (Long numSk);

    public SKieur getSkByNom(String nom);

    public SKieur addSkieurAndAssignToCours(SKieur sk,Long numC);


    public SKieur assignSkieurToPiste(Long numSk,Long numPiste);


    public List<SKieur> retrieveSkieurByTypeAbonnement (TypeAbonnement typeAbonnement);


}
