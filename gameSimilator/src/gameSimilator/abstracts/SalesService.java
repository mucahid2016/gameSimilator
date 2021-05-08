package gameSimilator.abstracts;

import gameSimilator.entities.Campaign;
import gameSimilator.entities.Game;
import gameSimilator.entities.Gamer;

public interface SalesService {
	void sale(Gamer gamer, Game game);
	void campaignSale(Gamer gamer, Game game,Campaign campaign);

}
