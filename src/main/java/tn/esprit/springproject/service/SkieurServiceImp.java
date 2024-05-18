package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Piste;
import tn.esprit.springproject.entities.SKieur;
import tn.esprit.springproject.repository.PisteRepository;
import tn.esprit.springproject.repository.SkieurRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class SkieurServiceImp implements ISkieur {

    private SkieurRepository skr;
    private PisteRepository pr;
    @Override
    public SKieur addSkieur(SKieur sk) {
        return skr.save(sk);
    }

    @Override
    public SKieur updateSkieur(SKieur sk) {
        return skr.save(sk);
    }

    @Override
    public List<SKieur> getAllSkieur() {
        return skr.findAll();
    }

    @Override
    public SKieur getSkById(Long numSk) {
        return skr.findById(numSk).orElse(null);
    }

    @Override
    public void deleteSkieur(Long numSk) {
        skr.deleteById(numSk);

    }
    @Override
    public SKieur getSkByNom(String nom) {
        return skr.findByNomS(nom);
    }

    @Override
    public SKieur assignSkieurToPiste(Long numSk, Long numPiste) {
        SKieur sk = skr.findById(numSk).orElse(null);
        Piste piste = pr.findById(numPiste).orElse(null);
       try {

           sk.getPistes().add(piste);
       }catch (NullPointerException e){
           Set<Piste> pistes = new HashSet<>();
           pistes.add(piste);
           sk.setPistes(pistes);
       }


        return skr.save(sk);
    }
}
