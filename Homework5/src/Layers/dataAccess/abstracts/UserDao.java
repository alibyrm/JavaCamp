package Layers.dataAccess.abstracts;

import java.util.List;

import Layers.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	boolean isEmailExists(String email);
	List<User> getUsers(User user);
	void login(User user);
	void logout(User user);
	

}
