package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Moniteur;

public interface MoniteurRepository extends JpaRepository<Moniteur,Long> {
}
