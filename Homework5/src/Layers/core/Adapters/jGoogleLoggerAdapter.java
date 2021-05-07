package Layers.core.Adapters;

import Layers.business.abstracts.AuthService;
import Layers.business.abstracts.jGoogleLoggerService;
import Layers.entities.concretes.User;
import Layers.jGoogleLoggerManager.JLoggerManager;

public class jGoogleLoggerAdapter implements AuthService{
	
	
	JLoggerManager jloggerManager = new JLoggerManager();

	

	@Override
	public boolean register(User user) {
		jloggerManager.loginWithGoogle("Google ile kayýt olundu.");
		return true;
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}
