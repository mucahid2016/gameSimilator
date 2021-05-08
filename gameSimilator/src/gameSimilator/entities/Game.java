package gameSimilator.entities;

import gameSimilator.abstracts.Entity;

public class Game implements Entity{
	private String gameName;
	private String gamePrice;
	public Game(String gameName, String gamePrice) {
		super();
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(String gamePrice) {
		this.gamePrice = gamePrice;
	}

}
