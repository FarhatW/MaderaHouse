package org.ril.madera.model;

import javax.persistence.*;

/**
 * Created by Jeremy on 10/03/2017.
 */

@Entity
@Table(name="groupe")
public class Groupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    int id;

    @Column(name="nom")
    String nom;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
