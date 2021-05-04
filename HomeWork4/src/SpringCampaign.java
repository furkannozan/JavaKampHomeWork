
public class SpringCampaign implements CampaignService{
	

	@Override
	public void add() {
		System.out.println("Spring Kampanya Eklendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println("Spring Kampanya Silindi" +gamer.getfirstName());
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

}
