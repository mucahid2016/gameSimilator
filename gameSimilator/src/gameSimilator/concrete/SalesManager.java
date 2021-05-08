package gameSimilator.concrete;

import gameSimilator.abstracts.SalesService;
import gameSimilator.entities.Campaign;
import gameSimilator.entities.Game;
import gameSimilator.entities.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() +": Adlý oyuncuya" +game.getGameName( ) +": Oyunu satýldý");
		
	}

	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName() +": Adlý oyuncuya" +game.getGameName( ) +": Oyunu satýldý"+ " Kampanyaya girdi"
	+campaign.getCampaignName());
		
	}

}
