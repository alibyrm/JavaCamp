package Layers.business.abstracts;

import Layers.entities.concretes.User;

public interface AuthService {
	boolean register(User user);
	void login (User user);

}
