package gameSimilator;

import java.time.LocalDate;

import adapters.MernisServiceAdapter;
import gameSimilator.abstracts.GameService;
import gameSimilator.concrete.CampaignCheckManager;
import gameSimilator.concrete.GameCheckManager;
import gameSimilator.concrete.GamerManager;
import gameSimilator.entities.Campaign;
import gameSimilator.entities.Game;
import gameSimilator.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(new Gamer("Ali", "Uzar", "1234",LocalDate.of(1977, 01, 01) ));
		
		GameService gameService = new GameCheckManager();
		gameService.add(new Game("Assasin", "101 TL"), new Gamer("Ali", "Uzar", "1234",LocalDate.of(1977, 01, 01)));
		
		
		CampaignCheckManager campaignCheckManager = new CampaignCheckManager();
		campaignCheckManager.add(new Campaign("Yeni indirim", "itiraz", 10));
		
		

	}

}
