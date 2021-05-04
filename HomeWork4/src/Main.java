
public class Main {

	public static void main(String[] args) {
		GamerEditManager editManager = new GamerEditManager();
		Gamer gamer = new Gamer();
		gamer.setfirstName("Furkan");
		gamer.setIdentificationNumber("321635421");
		gamer.setBirthYear(1997);
		gamer.setLastName("hkh");		
		editManager.add(gamer);
		CampaignService[] campaignServices = {new SummerCampaign(), new SpringCampaign()};
		
		GameSaleManager gameSaleManager =new GameSaleManager(campaignServices);
		
		gameSaleManager.sale(gamer);

	}

}
