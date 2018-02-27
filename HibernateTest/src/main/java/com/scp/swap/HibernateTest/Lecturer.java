package com.scp.swap.HibernateTest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lecturer_table")
public class Lecturer extends College {
	
	@Column(name = "lecturer_id")
	int lecturerId;
	
	@Column(name = "lecturer_name")
	String lecturerName;

	public int getLecturerId() {
		return lecturerId;
	}

	public void setLecturerId(int lecturerId) {
		this.lecturerId = lecturerId;
	}

	public String getLecturerName() {
		return lecturerName;
	}

	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}

	public Lecturer(int lecturerId, String lecturerName) {
		super();
		this.lecturerId = lecturerId;
		this.lecturerName = lecturerName;
	}

	public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Lecturer [lecturerId=" + lecturerId + ", lecturerName=" + lecturerName + ", collegeId=" + collegeId
				+ ", collegeName=" + collegeName + "]";
	}

}
