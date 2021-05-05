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
			System.out.println("Kiþi doðrulandý.");
		}
		else {
			System.out.println("Kiþi doðrulanamadý");
		}
	
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println("Kiþi baþarýyla silindi");
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Kiþi güncellendi");
		
	}

}
