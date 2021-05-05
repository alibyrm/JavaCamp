package Entities;

public class Game {
	private int gameId;
	private String gameName;
	private int gamerId;
	
	public Game() {
		
	}

	public Game(int gameId, String gameName, int gamerId) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamerId = gamerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

}
