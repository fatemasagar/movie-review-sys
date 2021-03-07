package service;

import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserService {
	
	List<User> user = new ArrayList<>();
	
	public List<User> addUser(User  user, List<User> users) {
		if (!users.contains(user.getName(user))) {
			this.user.add(user);
			return this.user;
		}
		return this.user;
	}
}
