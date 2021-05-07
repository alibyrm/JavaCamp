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
			System.out.println("�ifre an az 6 karakterden olu�mal�d�r ve email alan� bo� b�rak�lamaz.");
			return false;
		
		}else if (user.getFirstName().length()<=2 && user.getLastName().length()<=2) {
			System.out.println("Kullan�c� ad� veya soyad� en az 2 karakter olamal�d�r.");
			return false;
		}else {
			emailList.add(user.getEmail());
			return true;
		}
		
		
		
	}

	@Override
	public void login(User user) {
		if (emailList.contains(user.getEmail())) {
			System.out.println("Kullan�c� emaili zaten mevcut");
		}
		else {
			System.out.println("Ba�ar�yla sisteme giri� yap�ld�");
		}
		
		
	}

}
