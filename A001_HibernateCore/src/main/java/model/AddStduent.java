package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddStduent {
	public static void main(String[] args) {
		
		
		Student st  =new Student();
		st.setId(1);
		st.setName("Monil-u");
		st.setEmail("monil@yahoo.com");
		
		
		
		Configuration cfg  =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s  =sf.openSession();
		Transaction tx  =s.beginTransaction();
		
		s.saveOrUpdate(st);
		
		tx.commit();
		
	}

}
