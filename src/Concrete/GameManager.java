package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void Add(Game game) {
		System.out.println("Oyun sisteme eklenmiþtir" + game.getGameName());
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println("Oyun baþarýyla silinmiþtir" + game.getGameName());
		
	}

	@Override
	public void Update(Game game) {
		System.out.println("Oyun baþarýyla güncellenmiþtir" + game.getGameName());
		
	}

}
