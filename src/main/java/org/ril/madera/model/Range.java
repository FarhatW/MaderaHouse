package org.ril.madera.model;

import javax.persistence.*;

/**
 * Created by Gamer on 19/03/2017.
 */
@Entity
@Table(name = "gammes")
public class Range {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "finition_extern")
    private String finition_extern;

    @Column(name = "isolant_type")
    private String insulationType;

    @Column(name = "couverture_type")
    private String coverType;

    @Column(name = "gammescol")
    private String rangeCol;

    @ManyToOne
    @JoinColumn(name = "param_calcul_id")
    private CalcParameter calcParameter;

    @ManyToOne
    @JoinColumn(name = "Modele_gamme_idModele_gamme")
    private Country pays;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFinition_extern() {
        return finition_extern;
    }

    public void setFinition_extern(String finition_extern) {
        this.finition_extern = finition_extern;
    }

    public String getInsulationType() {
        return insulationType;
    }

    public void setInsulationType(String insulationType) {
        this.insulationType = insulationType;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getRangeCol() {
        return rangeCol;
    }

    public void setRangeCol(String rangeCol) {
        this.rangeCol = rangeCol;
    }

    public CalcParameter getCalcParameter() {
        return calcParameter;
    }

    public void setCalcParameter(CalcParameter calcParameter) {
        this.calcParameter = calcParameter;
    }

    public Country getPays() {
        return pays;
    }

    public void setPays(Country pays) {
        this.pays = pays;
    }
}
