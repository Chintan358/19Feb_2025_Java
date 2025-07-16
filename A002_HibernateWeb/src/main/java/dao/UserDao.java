package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDao {
	
		SessionFactory sf =null;
		public UserDao() {
			
			 sf  =new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(User.class)
					.buildSessionFactory();
		}
		
		public int addUser(User u)
		{
			int i=0;
			try {
				Session session = sf.openSession();
				Transaction tx  =session.beginTransaction();
				session.saveOrUpdate(u);
				tx.commit();
				i=1;
			} catch (Exception e) {
				e.printStackTrace();
			}
			

				return i;
			  
		}
		
		public List<User> ViewUsers()
		{
			
			try {
				Session session = sf.openSession();
				Transaction tx  =session.beginTransaction();
				
				return session.createQuery("from User").list();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return null;
			
		}
	
		public User UserById(int id)
		{
			
			try {
				Session session = sf.openSession();
				Transaction tx  =session.beginTransaction();
				return session.load(User.class, id);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return null;		
		}
		
		public int deleteUser(int id)
		{
			int i=0;
			try {
				Session session = sf.openSession();
				Transaction tx  =session.beginTransaction();
				User u =  session.load(User.class, id);
				session.delete(u);
				i=1;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return i;		
		}
}
