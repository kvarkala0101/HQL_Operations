package Test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQL_MultipleColumns_select {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tran = session.beginTransaction();
		

		
		String HQL_Query = "slect name, email from newStudent";	
		
		Query query = session.createQuery(HQL_Query);
		
		List<Object> list = query.list();
		
		for(Object ob : list){
			
			Object[] obj = (Object[])ob;
			System.out.println(obj[0]);
			System.out.println(obj[1]);
		}
		
		System.out.println();
		
		tran.commit();
		session.close();
		sf.close();
	}
}
