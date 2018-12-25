package Test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.NewStudent;

public class HQL_1Column_select {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tran = session.beginTransaction();
		

		
		String HQL_Query = "slect name from newStudent";	
		
		Query query = session.createQuery(HQL_Query);
		
		List<String> list = query.list();
		
		System.out.println(list.toString());
		

		
		System.out.println();
		
		tran.commit();
		session.close();
		sf.close();
	}
}
