package gameSimilator.concrete;

import gameSimilator.abstracts.GamerCheckService;
import gameSimilator.entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer)  {
		
		return true;
	}
	

}
