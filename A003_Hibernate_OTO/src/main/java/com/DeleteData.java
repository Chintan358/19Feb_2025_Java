package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Country;
import model.President;

public class DeleteData {
		public static void main(String[] args) {
			
			
			
			SessionFactory sf = 
					new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Country.class)
					.addAnnotatedClass(President.class)
					.buildSessionFactory();
			
			Session s  =sf.openSession();
			Transaction tx = s.beginTransaction();
			
			Country c = s.load(Country.class, 1);
			s.delete(c);
			
			
			
			tx.commit();
			
			
			
		}
}
