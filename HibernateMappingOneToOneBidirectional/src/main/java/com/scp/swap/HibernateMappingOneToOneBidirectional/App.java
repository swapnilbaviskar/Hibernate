package com.scp.swap.HibernateMappingOneToOneBidirectional;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	

    		
    		Employee em1 = new Employee("Babaro", null);

    		Address ad1 = new Address("Pune", null);
    		ad1.setEm(em1);
    		em1.setAd(ad1);

    		Employee em2 = new Employee("Bapurao", null);
    		Address ad2 = new Address("Mumbai", null);

    		ad2.setEm(em2);
    		em2.setAd(ad2);

    		SessionFactory sf = new Configuration().configure().buildSessionFactory();
    		Session s = sf.openSession();
    		Transaction tr= s.beginTransaction();

    		s.persist(em1);

    		s.persist(em2);
    		tr.commit();
    		s.close();
    	}

    }

