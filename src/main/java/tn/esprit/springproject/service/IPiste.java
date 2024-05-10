package tn.esprit.springproject.service;

import tn.esprit.springproject.entities.Piste;

import java.util.List;

public interface IPiste {

    public Piste addPiste(Piste pis);

    public Piste updatePiste(Piste pis);

    public List<Piste> getAllPiste();


    public Piste getPisteById (Long numPiste);


    public void deletePiste (Long numPiste);
}
