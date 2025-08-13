package com;

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

}
