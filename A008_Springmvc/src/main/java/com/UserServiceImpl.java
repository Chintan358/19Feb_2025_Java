package com;

import java.util.List;

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

	@Override
	public List<User> allUsers() {
		// TODO Auto-generated method stub
		return dao.allUsers();
	}

	@Override
	public User userById(int id) {
		// TODO Auto-generated method stub
		return dao.userById(id);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		dao.deleteUser(id);
	}

}
