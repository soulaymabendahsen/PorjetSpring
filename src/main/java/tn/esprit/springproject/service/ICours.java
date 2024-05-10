package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Cours;

import java.util.List;

public interface ICours {
    public Cours addCours(Cours cr);

    public Cours updateCours(Cours cr);

    public List<Cours> getAllCours();


    public Cours getcrById (Long numcr);


    public void deleteCours (Long numcr);
}
