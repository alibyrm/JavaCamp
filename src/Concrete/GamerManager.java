package Concrete;

import Abstract.GamerService;
import Abstract.ValidationService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	ValidationService validationService;

	public GamerManager(ValidationService validationService) {
		
		this.validationService = validationService;
	}

	@Override
	public void Add(Gamer gamer) {
		if (validationService.Validate(gamer)) {
			System.out.println("Ki�i do�ruland�.");
		}
		else {
			System.out.println("Ki�i do�rulanamad�");
		}
	
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println("Ki�i ba�ar�yla silindi");
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Ki�i g�ncellendi");
		
	}

}
