package com.scp.swap.HibernateMappingOneToOneBidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Emp")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "Emp_id")
	int empid;
	@Column(name = "Emp_name")
	String empName;

	@OneToOne(mappedBy="em",cascade=CascadeType.ALL)
	Address ad;

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", ad=" + ad + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	public Employee(String empName, Address ad) {
		super();
		//this.empid = empid;
		this.empName = empName;
		this.ad = ad;
	}

	public Employee() {
		super();

	}

}
