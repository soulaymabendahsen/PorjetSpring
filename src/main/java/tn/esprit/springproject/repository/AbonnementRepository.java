package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Abonnement;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {
}