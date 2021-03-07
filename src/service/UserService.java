package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.User;

public class UserService {
	
	List<User> users = new ArrayList<>();
	
	public List<User> addUser(User  user, List<User> users) {
		this.users = users;
		
		Iterator<User> iterator = users.iterator();
		
		while(iterator.hasNext()) {
			User u = iterator.next();
			if (u.getName(user) == user.getName(user)) {
				return this.users;
			}
		}
		
		this.users.add(user);
		return this.users;
	}
}
