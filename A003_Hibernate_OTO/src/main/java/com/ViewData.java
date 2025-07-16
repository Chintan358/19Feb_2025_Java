package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Country;
import model.President;

public class ViewData {
		public static void main(String[] args) {
			
			
			
			SessionFactory sf = 
					new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Country.class)
					.addAnnotatedClass(President.class)
					.buildSessionFactory();
			
			Session s  =sf.openSession();
			Transaction tx = s.beginTransaction();
			
			
			List<Country> countries =  s.createQuery("from Country").list();
			
			for(Country c  :countries)
			{
				System.out.println(c.getCountryName()+" "+c.getPresident().getPresidentName());
			}
			
					
			
		}
}
