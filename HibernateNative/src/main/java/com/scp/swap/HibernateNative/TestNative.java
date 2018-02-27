package com.scp.swap.HibernateNative;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestNative {
	public static void main(String[] args) {
		
	
	College c1 = new College(1, "AAAA");
	College c2 = new College(2, "BBBB");
	College c3 = new College(3, "CCCC");
	College c4 = new College(4, "DDDD");

	
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s=sf.openSession();
	Transaction tr=s.beginTransaction();
	s.save(c1);
	
	s.flush();
	tr.commit();
	
	org.hibernate.Query  sqlQueryGetStockById = s.getNamedQuery("sqlfindStockWithGivenId");
	sqlQueryGetStockById.setInteger("cid", 1);
	List<College> listOfObjectsSQLID = sqlQueryGetStockById.list();
	
	System.out.println("\nSQL By ID -- " + listOfObjectsSQLID);
	

	/*Query hqlQueryGetStockById=s.getNamedQuery("@HQL");
	hqlQueryGetStockById.setInteger("cname",105);
	List<College> listOfObjectsSQLID2 = hqlQueryGetStockById.list();
	System.out.println("\nHQL By ID -- " + listOfObjectsSQLID2);*/
	
}
	

}