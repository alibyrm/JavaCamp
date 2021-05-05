package Concrete;

import Abstract.ValidationService;
import Entities.Gamer;

public class ValidationManager implements ValidationService{

	@Override
	public boolean Validate(Gamer gamer) {
		if (gamer.getFirstName()=="Ali") {
			
			return true;
		}
		else {
			return false;
		}
		
	}

}
