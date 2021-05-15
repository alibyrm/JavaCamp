package Layers;

import java.util.ArrayList;
import java.util.List;

import Layers.business.abstracts.AuthService;
import Layers.business.abstracts.UserService;
import Layers.business.concretes.AuthManager;
import Layers.business.concretes.UserManager;
import Layers.core.Adapters.jGoogleLoggerAdapter;
import Layers.core.abstracts.EmailService;
import Layers.core.concretes.EmailManager;
import Layers.dataAccess.abstracts.UserDao;
import Layers.dataAccess.concretes.HibernateUserDao;
import Layers.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
			
		User user= new User(1,"Ali","Osman","1234566","aliosman@gmail.com");
		User user2= new User(2,"Halit","Bayram","661","halit6@gmail.com");
		
		
		

		UserService userService = new UserManager(new HibernateUserDao(),new AuthManager(),new EmailManager());
		userService.add(user2);
		
		
		
		
		

	}

}
