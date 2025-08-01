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
	
	public Category catById(int id)
	{
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		return s.get(Category.class, id);
	}


	public int addProduct(Product p) {
		
		int i=0;
		try {
			Session s = sf.openSession();
			Transaction tx  =s.beginTransaction();
			s.saveOrUpdate(p);
			tx.commit();
			i=1;
			
			
		} catch (Exception e) {
			i=0;
		}
		return i;
	}


	public List<Product> allProducts() {
		
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		return s.createQuery("from Product").list() ;
	}
	
}
