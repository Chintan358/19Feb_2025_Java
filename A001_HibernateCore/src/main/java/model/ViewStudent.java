package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ViewStudent {
	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s  =sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		//Student std =  s.get(Student.class, 2);
		//System.out.println(std);
		
		List<Student> stds =  s.createQuery("from Student").list();
		
		for(Student std : stds)
		{
			System.out.println(std.getId()+" "+std.getName()+" "+std.getEmail());
			
		}
		
		
		
		
		tx.commit();
		
	}
}
