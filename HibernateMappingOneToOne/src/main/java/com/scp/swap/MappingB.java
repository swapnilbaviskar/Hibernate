package com.scp.swap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingB {

	@SuppressWarnings("Salman")
	public static void main(String[] args) {

		StudentB student1 = new StudentB("pilu", "kamdev", "PT", null);
		StudentB student2 = new StudentB("Baba", "Ramdev", "Yoga", null);
		AddressB address1 = new AddressB("DP Road", "Satara", "UK", null);
		AddressB address2 = new AddressB("Karve Road", "Pune", "India", null);
		address1.setStudent(student1);
		address2.setStudent(student2);

		student1.setAddress(address1);
		student2.setAddress(address2);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(address1);
		System.out.println(address2);

		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		/*
		 * session.persist(address); student.setAddress(address);
		 */
		session.save(student1);
		session.persist(student2);
		//session.persist(address1);
		//session.persist(address2);

		session.getTransaction().commit();
		session.close();
	}

}