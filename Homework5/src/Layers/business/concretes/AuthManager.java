package Layers.business.concretes;

import java.util.ArrayList;
import java.util.List;

import Layers.business.abstracts.AuthService;
import Layers.core.abstracts.EmailService;
import Layers.dataAccess.abstracts.UserDao;
import Layers.entities.concretes.User;

public class AuthManager implements AuthService{
	

	
	List<String> emailList = new ArrayList<String>();
     
	@Override
	public boolean register(User user) {
		if (user.getPassword().length()<=6 && user.getEmail().isEmpty()) {
			System.out.println("Þifre an az 6 karakterden oluþmalýdýr ve email alaný boþ býrakýlamaz.");
			return false;
		
		}else if (user.getFirstName().length()<=2 && user.getLastName().length()<=2) {
			System.out.println("Kullanýcý adý veya soyadý en az 2 karakter olamalýdýr.");
			return false;
		}else {
			emailList.add(user.getEmail());
			return true;
		}
		
		
		
	}

	@Override
	public void login(User user) {
		if (emailList.contains(user.getEmail())) {
			System.out.println("Kullanýcý emaili zaten mevcut");
		}
		else {
			System.out.println("Baþarýyla sisteme giriþ yapýldý");
		}
		
		
	}

}
