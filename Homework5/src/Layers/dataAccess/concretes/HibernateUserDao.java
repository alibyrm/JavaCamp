package Layers.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Layers.dataAccess.abstracts.UserDao;
import Layers.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();
	

	public HibernateUserDao() {
		users.add( new User(1,"Ali","Osman","13245","ali@gmail.com"));
		users.add(new User(2,"Halit","Bayram","54321","halit@gmail.com"));
	}

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullan�c� sisteme ba�ar�l� bir �ekilde eklendi.");
		
				
		
	}

	@Override
	public void delete(User user) {
		users.remove(0);
		System.out.println("Kullan�c� sistemden ba�ar�l� bir �ekilde silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� ba�ar�l� bir �ekilde g�ncellendi.");
		
	}

	@Override
	public boolean isEmailExists(String email) {
		for (User user : users) {
			if (user.getEmail()==email) {
				return false;
			}
		}
		return true;
	}

	@Override
	public List<User> getUsers(User user) {
		
		
	
		return null;
	}

	@Override
	public void login(User user) {
		System.out.println("Kullan�c� sisteme giri� yapt�." + user.getFirstName());
		
	}

	@Override
	public void logout(User user) {
		System.out.println("Kullan�c� sistemden ba�ar�l� bir �ekilde ��k�� yapt�." + user.getFirstName());
		
	}

}
