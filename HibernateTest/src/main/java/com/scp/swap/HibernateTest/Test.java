package com.scp.swap.HibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		
		 
		    	
		    	College s=new Student(111, "Morgan");
		    	College l=new Lecturer(010, "Rick");
		    	
		    	College c=new College(555,"CMCS");
		        @SuppressWarnings("deprecation")
				SessionFactory sf=new Configuration().configure().buildSessionFactory();
		        Session s1=sf.openSession();
		        Transaction tr=s1.beginTransaction();
		        s1.save(c);
		        s1.save(s);
		        s1.save(l);
		        tr.commit();
		        s1.close();
		        
		           
	}

}
