package Test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.NewStudent;

public class HQL_1ROW_SELECT {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tran = session.beginTransaction();
		

		
		String HQL_Query = "from newStudent where id=123";	
		
		Query query = session.createQuery(HQL_Query);
		
		NewStudent obj = (NewStudent)query.uniqueResult();
		
		System.out.println(obj.getAddress());
		System.out.println(obj.getEmail());
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		
		System.out.println();
		
		tran.commit();
		session.close();
		sf.close();
		
	}
}
