package com.scp.swap;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_B")
public class StudentB {


	@Id
    @GeneratedValue
    @Column(name = "STUDENT_ID")
    private long id;
 
    @Column(name = "FIRST_NAME")
    private String firstName;
 
    @Column(name = "LAST_NAME")
    private String lastName;
 
    @Column(name = "SECTION")
    private String section;
 
    @OneToOne   (cascade = CascadeType.ALL)
    
    private AddressB address;

		public StudentB() {

		}

		public StudentB(String firstName, String lastName, String section,AddressB address) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.section = section;
			this.address=address;
		}

		

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getSection() {
			return section;
		}

		public void setSection(String section) {
			this.section = section;
		}

		public AddressB getAddress() {
			return address;
		}

		public void setAddress(AddressB address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "StudentB [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", section=" + section
					+ "]";
		}

		

	}




