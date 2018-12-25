package Test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.OldStudent;

public class HQL_TABLE_DumpData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tran = session.beginTransaction();
		

		
		String HQL_Query = "insert into newStudent(id, name, email, address) select s.id, s.name, s.email, s.address from oldStudent s";	
		
		Query query = session.createQuery(HQL_Query);
		
		int num = query.executeUpdate();
		
		System.out.println(num +" number of rows are inserted into newStudent table");
		
		tran.commit();
		session.close();
		sf.close();
		
		
	}
}
