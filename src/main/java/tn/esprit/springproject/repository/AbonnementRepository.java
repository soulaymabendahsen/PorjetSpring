package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.SKieur;
import tn.esprit.springproject.entities.TypeAbonnement;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {

    public List<Abonnement> findByTypeAbon(TypeAbonnement typeAbonnement);



    public List<Abonnement> findByDateDebutBetween(LocalDate date1 , LocalDate date2);


}
