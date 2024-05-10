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
public class Piste implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private long numPiste;
    private String nomPiste;

    private int longeur;

    private int pente;

    @Enumerated(EnumType.STRING)
    private Couleur couleur;

    @ManyToMany(mappedBy = "piste")
    private Set<SKieur> skieur;

}
