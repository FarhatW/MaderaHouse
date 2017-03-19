package org.ril.madera.model;

import javax.persistence.*;

/**
 * Created by Gamer on 19/03/2017.
 */
@Entity
@Table(name = "module")
public class Module {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom")
    private String name;

    @Column(name = "coupe_principale")
    private String mainCut;

    @Column(name = "cctp")
    private String cctp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainCut() {
        return mainCut;
    }

    public void setMainCut(String mainCut) {
        this.mainCut = mainCut;
    }

    public String getCctp() {
        return cctp;
    }

    public void setCctp(String cctp) {
        this.cctp = cctp;
    }
}
