
public class GameSaleManager implements GameSaleServise {
	private CampaignService[] campaignService;

	public GameSaleManager(CampaignService[] campaignService) {
		this.campaignService = campaignService;
	}

	@Override
	public void sale(Gamer gamer) {
		System.out.println("Oyun satýldý." );
		
		Utils.utils(campaignService,gamer.getfirstName());
		
	}
	
	

}
