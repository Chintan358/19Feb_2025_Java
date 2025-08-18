package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory factory;

	@Override
	public void adduser(User u) {
		
		Session s = factory.openSession();
		Transaction tx  =s.beginTransaction();
		s.saveOrUpdate(u);
		tx.commit();
		
	}

	@Override
	public List<User> allUsers() {
		
		Session s = factory.openSession();
		Transaction tx  =s.beginTransaction();
		return s.createQuery("from User").list();
	}

	@Override
	public User userById(int id) {
		
		Session s = factory.openSession();
		Transaction tx  =s.beginTransaction();
		return s.get(User.class, id);
	}

	@Override
	public void deleteUser(int id) {
		
		Session s = factory.openSession();
		Transaction tx  =s.beginTransaction();
		User u =  s.get(User.class, id);
		s.delete(u);
		tx.commit();
	}

}
