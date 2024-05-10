package tn.esprit.springproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.repository.InscriptionRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class InscriptionServiceImp implements IInscription {

    private InscriptionRepository ir;
    @Override
    public Inscription addInscription(Inscription in) {
        return ir.save(in);
    }

    @Override
    public Inscription updateInscription(Inscription in) {
        return ir.save(in);
    }

    @Override
    public List<Inscription> getAllInscription() {
        return ir.findAll();
    }

    @Override
    public Inscription getInscriptionById(Long numInscription) {
        return ir.findById(numInscription).orElse(null);
    }

    @Override
    public void deleteInscription(Long numInscription) {
        ir.deleteById(numInscription);

    }
}
