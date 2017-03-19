package org.ril.madera.model;

import javax.persistence.*;

/**
 * Created by Jeremy on 10/03/2017.
 */
@Entity
@Table(name="Site")
public class Site {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="CP")
    private String cp;

    @Column(name="adresse")
    private String adress;

    @ManyToOne
    @JoinColumn(name = "Ville_id")
    private City city;

    public String getAdress() {
        return adress;
    }

    public String getVille() {
        return city.getName();
    }

    public String getCp() {
        return cp;
    }

    public String getPays() {
        return city.getPays().getCountryName();
    }
}
