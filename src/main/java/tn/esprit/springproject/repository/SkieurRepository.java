package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.SKieur;
import tn.esprit.springproject.entities.TypeAbonnement;

import java.util.List;

public interface SkieurRepository extends JpaRepository<SKieur,Long> {



    //c'est l'équivalent de select * from Skieur where nomS='nomS'
    public SKieur findByNomS(String nomS);




    public List<SKieur> findByAbonnement_TypeAbon(TypeAbonnement typeAbonnement);
}
