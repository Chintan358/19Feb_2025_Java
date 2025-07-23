package com;

import java.awt.datatransfer.Transferable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Course;
import model.Faculty;

public class DeleteData {
		public static void main(String[] args) {
			
			
			SessionFactory sf = 
					new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Faculty.class)
					.addAnnotatedClass(Course.class)
					.buildSessionFactory();
			
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();

			Faculty f  =session.load(Faculty.class, 1);
			session.delete(f);
			
			tx.commit();
			
			
			
			
		}
}
