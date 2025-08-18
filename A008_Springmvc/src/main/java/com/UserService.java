package com;

import java.util.List;

public interface UserService {
	
	public void adduser(User u);
	public List<User> allUsers();
	public User userById(int id);
	public void deleteUser(int id);
}
