package tn.esprit.springproject.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Abonnement implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numAbon;

    private LocalDate dateDebut;

    private LocalDate dateFin;


    private float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;


}
