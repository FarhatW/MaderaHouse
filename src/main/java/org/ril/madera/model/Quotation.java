package org.ril.madera.model;

import javax.persistence.*;

/**
 * Created by Gamer on 19/03/2017.
 */
@Entity
@Table(name = "devis")
public class Quotation {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dateDebut")
    private String stared_at;

    @Column(name = "dateFin")
    private String finished_at;

    @ManyToOne
    @JoinColumn(name = "projet_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "idCommercial")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "Etat_id")
    private State state;


}
