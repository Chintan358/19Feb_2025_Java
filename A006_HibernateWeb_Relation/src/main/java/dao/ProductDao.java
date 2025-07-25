package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class ProductDao {
	
	SessionFactory sf = null;
	public ProductDao() {
			sf = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Category.class)
					.addAnnotatedClass(Product.class)
					.buildSessionFactory();
	}
	
	
	public List<Category> allCategories()
	{
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		return s.createQuery("from Category").list();
	}
	
}
