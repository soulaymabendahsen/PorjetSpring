package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Piste;

public interface PisteRepository extends JpaRepository<Piste,Long> {
}
