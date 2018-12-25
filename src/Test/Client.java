package Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.OldStudent;

public class Client {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tran = session.beginTransaction();
		
		OldStudent oldStudent = new OldStudent(123, "abc", "abc@gmail.com", "hyd");
		OldStudent oldStudent1 = new OldStudent(124, "bca", "bca@gmail.com", "hyd");
		OldStudent oldStudent2 = new OldStudent(125, "cab", "cab@gmail.com", "hyd");
		
		
		session.save(oldStudent);
		session.save(oldStudent1);
		session.save(oldStudent2);		
		
		tran.commit();
		session.close();
		sf.close();
		
		
	}
}
