package com;

import java.awt.datatransfer.Transferable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Course;
import model.Faculty;

public class AddData {
		public static void main(String[] args) {
			
			
			SessionFactory sf = 
					new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Faculty.class)
					.addAnnotatedClass(Course.class)
					.buildSessionFactory();
			
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			
//			Faculty f = new Faculty();
//			f.setName("Monil");
//			
//			
//			Course c1 = new Course();
//			c1.setName("Php");
//			
//			
//			
//			Course c2  =new Course();
//			c2.setName("Android");
//			
//			f.addCounrse(c1);
//			f.addCounrse(c2);
			
			
			
			
			Course c  =session.load(Course.class, 1);
			
			Faculty f1 = new Faculty();
			f1.setName("Shivshankar");
			f1.addCounrse(c);
			
			session.save(f1);
			
			
			
			tx.commit();
			
			
			
			
		}
}
