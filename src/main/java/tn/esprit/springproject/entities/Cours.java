package tn.esprit.springproject.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Cours implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long numCours;
    private int niveau ;

    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;

    @Enumerated(EnumType.STRING)
    private Support support;


    private float prix;
    private int creneau;


    @OneToMany(mappedBy = "cours")
    private Set<Inscription> inscriptions;




}
