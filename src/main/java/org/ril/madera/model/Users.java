package org.ril.madera.model;

import javax.persistence.*;

import org.ril.madera.model.Groupe;

/*
 * This is our model class and it corresponds to Country table in database
 */
@Entity
@Table(name = "utilisateur")
public class Users {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "prenom")
    private String firstName;

    @Column(name = "nom")
    private String lastName;

    @Column(name = "mail")
    private String email;

    @Column(name = "numeroTel")
    private String phone;

    @Column(name = "token")
    private String token;

    @ManyToOne
    @JoinColumn(name = "Groupe_id")
    private Groupe group;

    @ManyToOne
    @JoinColumn(name = "Site_id")
    private Site site;

    @Column(name = "token_expir")
    private String expire;


    public Users() {
        super();
    }

    public Users(String firstName, String lastName, String email, String phone) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGroup() {
        return group.getNom();
    }

    public String getAdress() {
        return site.getAdress();
    }

    public String getVille() {
        return site.getVille();
    }

    public String getCp() {
        return site.getCp();
    }

    public String getPays() {
        return site.getPays();
    }
}