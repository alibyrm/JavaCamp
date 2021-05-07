package Layers.business.abstracts;

import java.util.List;

import Layers.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update (User user);
	
	

}
