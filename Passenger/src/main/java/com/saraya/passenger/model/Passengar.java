package com.saraya.passenger.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passengar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long passenger_id;
	private String passport_no;
	private String firstname;
	private String lastname;
	private Long passenger_details_id;
	private String email;
	private String telephone;
	public Passengar() {
		super();
	}
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public Long getPassenger_details_id() {
		return passenger_details_id;
	}


	public void setPassenger_details_id(Long passenger_details_id) {
		this.passenger_details_id = passenger_details_id;
	}


	public Long getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(Long passenger_id) {
		this.passenger_id = passenger_id;
	}
	public String getPassport_no() {
		return passport_no;
	}
	public void setPassport_no(String passport_no) {
		this.passport_no = passport_no;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
