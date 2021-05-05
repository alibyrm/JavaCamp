package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void Add(Game game) {
		System.out.println("Oyun sisteme eklenmi�tir" + game.getGameName());
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println("Oyun ba�ar�yla silinmi�tir" + game.getGameName());
		
	}

	@Override
	public void Update(Game game) {
		System.out.println("Oyun ba�ar�yla g�ncellenmi�tir" + game.getGameName());
		
	}

}
