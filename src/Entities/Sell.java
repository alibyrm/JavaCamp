package Entities;

public class Sell {
	private int sellId;
	private int gamerId;
	private int campaignId;
	private int gameId;
	
	public Sell() {
		
	}

	public Sell(int sellId, int gamerId, int campaignId, int gameId) {
		super();
		this.sellId = sellId;
		this.gamerId = gamerId;
		this.campaignId = campaignId;
		this.gameId = gameId;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	

}
