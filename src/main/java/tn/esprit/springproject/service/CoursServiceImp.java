package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Cours;
import tn.esprit.springproject.repository.CoursRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class CoursServiceImp implements ICours{
    private CoursRepository crr;
    @Override
    public Cours addCours(Cours cr) {
        return crr.save(cr);
    }

    @Override
    public Cours updateCours(Cours cr) {
        return crr.save(cr);
    }

    @Override
    public List<Cours> getAllCours() {
        return crr.findAll();
    }

    @Override
    public Cours getcrById(Long numcr) {
        return crr.findById(numcr).orElse(null);
    }

    @Override
    public void deleteCours(Long numcr) {

        crr.deleteById(numcr);

    }
}
