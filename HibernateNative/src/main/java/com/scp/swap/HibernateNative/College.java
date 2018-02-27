package com.scp.swap.HibernateNative;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity

@Table(name = "College_Info")

@NamedNativeQueries({
		@NamedNativeQuery(name = "sqlfindStockWithGivenId", query = "select * from College_Info  where college_id = :cid", resultClass = College.class),
		@NamedNativeQuery(name = "sqlfindStockWithGivenName", query = "select * from College_Info  where college_name = :cname", resultClass = College.class) })

/*
 * @NamedQueries({ @NamedQuery(name = "@HQL", query =
 * "from College c where c.collegeId = :cid") })
 */
public class College {
	@Id
	@GeneratedValue
	@Column(name = "college_id")
	int collegeId;
	@Column(name = "college_name")
	String collegeName;

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public College(int collegeId, String collegeName) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
	}

	public College() {
		super();

	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + "]";
	}

}
