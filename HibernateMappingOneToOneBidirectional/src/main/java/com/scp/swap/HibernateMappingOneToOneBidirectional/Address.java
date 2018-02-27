package com.scp.swap.HibernateMappingOneToOneBidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Addr")
public class Address {
	@Id
	@GeneratedValue
	@Column(name = "add_pin")
	int pin;
	@Column(name = "add_city")
	String city;

	@OneToOne
	@JoinColumn(name="Empid")
	
	Employee em;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee getEm() {
		return em;
	}

	public void setEm(Employee em) {
		this.em = em;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", em=" + em + "]";
	}

	public Address(String city, Employee em) {
		super();
		//this.pin = pin;
		this.city = city;
		this.em = em;
	}

	public Address() {
		super();
	}

}
