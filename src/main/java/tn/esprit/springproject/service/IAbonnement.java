package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.TypeAbonnement;

import java.util.List;

public interface IAbonnement {

    public Abonnement addAbonnement(Abonnement ab);

    public Abonnement updateAbonnement(Abonnement ab);

    public List<Abonnement> getAllAbonnement();


    public Abonnement getAbById (Long numAbon);


    public void deleteAbonnement (Long numAbon);

    public List<Abonnement> listeAbonnements (TypeAbonnement typeAbonnement);
}
