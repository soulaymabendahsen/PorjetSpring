package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.SKieur;

public interface SkieurRepository extends JpaRepository<SKieur,Long> {



    //c'est l'équivalent de select * from Skieur where nomS='nomS'
    public SKieur findByNomS(String nomS);

}
