package gameSimilator.concrete;

import gameSimilator.abstracts.GamerCheckService;
import gameSimilator.abstracts.gamerService;
import gameSimilator.entities.Gamer;

public class GamerManager  implements gamerService{
	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(GamerCheckService.checkRealIfPerson) {
			System.out.println("Oyuncu eklendi:" +gamer.getFirstName());
		}else {
			System.out.println("Oyuncu eklenemedi");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi: "+ gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi: " + gamer.getFirstName());
		
	}

	

}
