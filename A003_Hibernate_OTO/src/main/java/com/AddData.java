package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Country;
import model.President;

public class AddData {
		public static void main(String[] args) {
			
			
			
			SessionFactory sf = 
					new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Country.class)
					.addAnnotatedClass(President.class)
					.buildSessionFactory();
			
			Session s  =sf.openSession();
			Transaction tx = s.beginTransaction();
			
			
			Country c = new Country();
			c.setCountryName("USA");
			
			President p = new President();
			p.setPresidentName("Donald Trump");
			
			c.setPresident(p);
			
			s.save(c);
			
			
			tx.commit();
			
			
			
		}
}
