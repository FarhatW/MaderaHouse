package org.ril.madera.model;

import javax.persistence.*;

/**
 * Created by Gamer on 19/03/2017.
 */
@Entity
@Table(name="param_calcul")
public class CalcParameter {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="prix")
    String price;

    @Column(name="prix_vente")
    String sellingPrice;

    @Column(name="marge_commerciaux")
    String CommercialMargin;

    @Column(name="marge_entreprise")
    String companyMargin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getCommercialMargin() {
        return CommercialMargin;
    }

    public void setCommercialMargin(String commercialMargin) {
        CommercialMargin = commercialMargin;
    }

    public String getCompanyMargin() {
        return companyMargin;
    }

    public void setCompanyMargin(String companyMargin) {
        this.companyMargin = companyMargin;
    }
}
