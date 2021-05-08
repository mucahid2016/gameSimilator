package gameSimilator.concrete;

import gameSimilator.abstracts.CampaignService;
import gameSimilator.entities.Campaign;

public class CampaignCheckManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : "+ campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi  : "+ campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : "+ campaign.getCampaignName());
		
	}

}
