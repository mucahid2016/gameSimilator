package gameSimilator.entities;

import gameSimilator.abstracts.Entity;

public class Campaign implements Entity {
	private String campaignName;
	private String contect;
	private double discount;
	public Campaign(String campaignName, String contect, double discount) {
		super();
		this.campaignName = campaignName;
		this.contect = contect;
		this.discount = discount;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getContect() {
		return contect;
	}
	public void setContect(String contect) {
		this.contect = contect;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	

}
