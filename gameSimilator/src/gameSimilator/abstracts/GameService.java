package gameSimilator.abstracts;

import gameSimilator.entities.Game;
import gameSimilator.entities.Gamer;

public interface GameService {
	void add(Game game, Gamer gamer);

	void delete(Game game, Gamer gamer);

	void update(Game game, Gamer gamer);

}
