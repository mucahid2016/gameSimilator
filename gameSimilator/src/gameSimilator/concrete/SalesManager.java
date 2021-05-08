package gameSimilator.concrete;

import gameSimilator.abstracts.SalesService;
import gameSimilator.entities.Campaign;
import gameSimilator.entities.Game;
import gameSimilator.entities.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() +": Adl� oyuncuya" +game.getGameName( ) +": Oyunu sat�ld�");
		
	}

	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName() +": Adl� oyuncuya" +game.getGameName( ) +": Oyunu sat�ld�"+ " Kampanyaya girdi"
	+campaign.getCampaignName());
		
	}

}
