package org.ril.madera.model;

import javax.persistence.*;

/*
 * This is our model class and it corresponds to Country table in database
 */
@Entity
@Table(name="USERS")
public class Users {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;

	@Column(name="first_name")
	String first_name;

	@Column(name="last_name")
	long last_name;

	@Column(name="email")
	long email;

	@Column(name="phone")
	long phone;

	@Column(name="qr_code_id")
	long qr_code_id;

	@Column(name="token")
	long token;

	public Users() {
		super();
	}

	public Users(String first_name, long last_name, long email, long phone, long qr_code_id) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone = phone;
		this.qr_code_id = qr_code_id;
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

	public long getQr_code_id() {
		return qr_code_id;
	}

	public void setQr_code_id(long qr_code_id) {
		this.qr_code_id = qr_code_id;
	}
}