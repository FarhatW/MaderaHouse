package org.ril.madera.model;


import javax.persistence.*;

/**
 * Created by Jeremy on 10/03/2017.
 */
@Entity
@Table(name = "Ville")
public class City {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom")
    private String name;

    @ManyToOne
    @JoinColumn(name = "Pays_id")
    private Country pays;

    public City() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Country getPays() {
        return pays;
    }

    public void setPays(Country pays) {
        this.pays = pays;
    }
}
