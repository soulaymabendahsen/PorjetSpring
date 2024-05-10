package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Moniteur;

import java.util.List;

public interface IMoniteur {

    public Moniteur addMoniteur(Moniteur mon);

    public Moniteur updateMoniteur(Moniteur mon);

    public List<Moniteur> getAllMoniteur();


    public Moniteur getMoniteurById (Long numMoniteur);


    public void deleteMoniteur (Long numMoniteur);
}
