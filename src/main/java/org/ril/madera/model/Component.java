package org.ril.madera.model;

import javax.persistence.*;

/**
 * Created by Gamer on 19/03/2017.
 */
@Entity
@Table(name = "composant")
public class Component {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "famille_composant_id")
    private ComponentFamily family;

    @Column(name = "nature")
    private String nature;

    @Column(name = "caractéristique")
    private String characteristic;

    @Column(name = "unite_usage")
    private String unit;

    @ManyToOne
    @JoinColumn(name = "Gammes_id")
    private Range range;

    @Column(name = "Gammes_param_calcul_id")
    private String rangeClaclPramaeter;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ComponentFamily getFamily() {
        return family;
    }

    public void setFamily(ComponentFamily family) {
        this.family = family;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    public String getRangeClaclPramaeter() {
        return rangeClaclPramaeter;
    }

    public void setRangeClaclPramaeter(String rangeClaclPramaeter) {
        this.rangeClaclPramaeter = rangeClaclPramaeter;
    }
}
