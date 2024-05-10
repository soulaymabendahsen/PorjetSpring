package tn.esprit.springproject.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Moniteur implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long numMoniteur;
    private String nomM;
    private String prenomMoniteur;
    private LocalDate dateRecru;

    @OneToMany
    private Set<Cours> cours;
}
