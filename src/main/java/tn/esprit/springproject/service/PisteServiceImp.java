package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Piste;
import tn.esprit.springproject.repository.PisteRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class PisteServiceImp implements IPiste{

    private PisteRepository pr;
    @Override
    public Piste addPiste(Piste pis) {
        return pr.save(pis);
    }

    @Override
    public Piste updatePiste(Piste pis) {
        return pr.save(pis);
    }

    @Override
    public List<Piste> getAllPiste() {
        return pr.findAll();
    }

    @Override
    public Piste getPisteById(Long numPiste) {
        return pr.findById(numPiste).orElse(null);
    }

    @Override
    public void deletePiste(Long numPiste) {

        pr.deleteById(numPiste);

    }
}
