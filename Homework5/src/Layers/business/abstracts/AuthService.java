package Layers.business.abstracts;

import Layers.entities.concretes.User;

public interface AuthService {
	boolean register(User user);
	boolean login (User user);

}
