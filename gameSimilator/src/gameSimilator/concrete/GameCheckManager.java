package gameSimilator.concrete;

import gameSimilator.abstracts.GameService;
import gameSimilator.entities.Game;
import gameSimilator.entities.Gamer;

public class GameCheckManager implements  GameService{

	@Override
	public void add(Game game, Gamer gamer) {
		System.out.println( game.getGameName()+ ": Oyunu eklendi");
		
	}

	@Override
	public void delete(Game game, Gamer gamer) {
		System.out.println( game.getGameName()+ ": Oyunu silindi");
		
	}

	@Override
	public void update(Game game, Gamer gamer) {
		System.out.println( game.getGameName()+ ": Oyunu güncellendi");
		
	}

}
