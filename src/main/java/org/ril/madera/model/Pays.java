package org.ril.madera.model;

import javax.persistence.*;

/**
 * Created by Jeremy on 10/03/2017.
 */
@Entity
@Table(name = "Pays")
public class Pays {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom")
    private String name;

    public String getName() {
        return name;
    }
}
