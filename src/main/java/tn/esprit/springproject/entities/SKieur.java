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
public class SKieur implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Id
    private long numSK;
    private String  nomS;

    private String prenomS;

    private LocalDate dateNaissance;

    private String ville;
    @OneToOne
    private Abonnement abonnement;

    @OneToMany(mappedBy = "skieur")
    private Set<Inscription> inscriptions;
    @ManyToMany
    private Set<Piste> piste;



}
