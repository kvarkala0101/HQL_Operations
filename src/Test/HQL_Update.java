package Test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQL_Update {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tran = session.beginTransaction();
		

		
		String HQL_Query = "update newStudent set id=124 where id=123";	
		
		Query query = session.createQuery(HQL_Query);
		
		int num = query.executeUpdate();
		
		System.out.println(num +" number of rows are inserted into newStudent table");
		
		tran.commit();
		session.close();
		sf.close();
		
		
	}
}
