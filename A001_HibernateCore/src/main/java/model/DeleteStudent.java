package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {
	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s  =sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		Student std =  s.load(Student.class, 1);
		s.delete(std);
		
		tx.commit();
		
	}
}
