package tn.esprit.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours,Long> {


}
