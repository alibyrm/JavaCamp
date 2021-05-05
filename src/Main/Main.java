package Main;

import Abstract.GamerService;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.ValidationManager;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1,"Ali","Bayram","12345678910");
		GamerService gamerService= new GamerManager(new ValidationManager());
		gamerService.Add(gamer);
		
	}

}
