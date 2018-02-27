package com.scp.swap.HibernateTest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="student_table")
public class Student extends College {
	@Column(name="student_id")
	int studentId;
	@Column(name="student_name")

	String studentName;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	

}
