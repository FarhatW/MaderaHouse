package org.ril.madera.model;

import org.ril.madera.model.Pays;

import javax.persistence.*;

/**
 * Created by Jeremy on 10/03/2017.
 */
@Entity
@Table(name = "Ville")
public class Ville {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom")
    private String name;

    @ManyToOne
    @JoinColumn(name = "Pays_id")
    private Pays pays;

    public String getName() {
        return name;
    }

    public String getPays() {
        return pays.getName();
    }
}
