package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	UserDao dao;
	
	@Override
	public void adduser(User u) {
		
		dao.adduser(u);
	}

}
