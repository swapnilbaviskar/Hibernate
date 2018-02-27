package com.scp.swap;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ADDRESS_B")
public class AddressB {

	  @Id
	    @Column(name="ADDRESS_ID")
	    @GeneratedValue
	   // @GenericGenerator(name="gen", strategy="foreign")
	    private long id;
	 
	    @Column(name = "STREET")
	    private String street;
	 
	    @Column(name = "CITY")
	    private String city;
	 
	    @Column(name = "COUNTRY")
	    private String country;
	 
	    @OneToOne//(cascade=CascadeType.ALL)
	    private StudentB student;
	 
	    public AddressB() {
	 
	    }

	public AddressB(String street, String city, String country,StudentB student) {
		this.street = street;
		this.city = city;
		this.country = country;
		this.student=student;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public StudentB getStudent() {
		return student;
	}

	public void setStudent(StudentB student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "AddressB [id=" + id + ", street=" + street + ", city=" + city + ", country=" + country + "]";
	}

}
