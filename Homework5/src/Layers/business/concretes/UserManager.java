package Layers.business.concretes;

import java.util.List;

import Layers.business.abstracts.AuthService;
import Layers.business.abstracts.UserService;
import Layers.business.abstracts.jGoogleLoggerService;
import Layers.core.abstracts.EmailService;
import Layers.dataAccess.abstracts.UserDao;
import Layers.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userdao;
	private AuthService authService;
	private EmailService emailService;
	

	public UserManager(UserDao userdao, AuthService authService, EmailService emailService) {
		super();
		this.userdao = userdao;
		this.authService=authService;
		this.emailService=emailService;
			}

	@Override
	public void add(User user) {
		if (authService.register(user)) {
			userdao.add(user);
			emailService.isValidEmail(user.getEmail());
			emailService.sendEmail(user.getEmail());
			emailService.activateEmail(user.getEmail());
			System.out.println("Kullanýcý sisteme eklendi" + user.getFirstName());
			
			
			
		}
		
		
		
	}

	@Override
	public void delete(User user) {
		userdao.delete(user);
		System.out.println("Kullanýcý silindi.");
		
	}

	@Override
	public void update(User user) {
		userdao.update(user);
		System.out.println("Kullanýcý güncellendi");
		
	}

	

}
