package org.ril.madera.model;

import javax.persistence.*;

/*
 * This is our model class and it corresponds to Country table in database
 */
@Entity
@Table(name="utilisateur")
public class Users {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;

	@Column(name="prenom")
	String first_name;

	@Column(name="nom")
	long last_name;

	@Column(name= "mail")
	long email;

	@Column(name="numeroTel")
	long phone;

	@Column(name="token")
	long token;

	@Column(name="token_expir")
	long expire;

	public Users() {
		super();
	}

	public Users(String first_name, long last_name, long email, long phone, long qr_code_id) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone = phone;
	}

	public long getToken() {
		return token;
	}

	public void setToken(long token) {
		this.token = token;
	}

	public long getExpire() {
		return expire;
	}

	public void setExpire(long expire) {
		this.expire = expire;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public long getLast_name() {
		return last_name;
	}

	public void setLast_name(long last_name) {
		this.last_name = last_name;
	}

	public long getEmail() {
		return email;
	}

	public void setEmail(long email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}