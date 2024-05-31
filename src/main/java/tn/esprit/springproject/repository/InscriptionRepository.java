package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.entities.Support;

import java.util.List;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {



    @Query("select i.numSemaine from Inscription i " +
            "join Moniteur m " +
            "on i.cours member of m.cours " +
            "where m.numMoniteur =:numMoniteur and i.cours.support =:support"
    )
    public List<Integer> numWeeksCourseOfInstructorBySupport(@Param("numMoniteur") Long numMoniteur, @Param("support") Support support);
}

