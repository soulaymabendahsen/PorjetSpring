package tn.esprit.springproject.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Inscription implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long numInscription ;
    private int numSemaine;
    @ManyToOne
    private SKieur skieur;

    @ManyToOne
    private Cours cours;
}
