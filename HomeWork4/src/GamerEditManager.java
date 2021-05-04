
public class GamerEditManager implements GamerEditService {

	
	
	@Override
	public void add(Gamer gamer) {
		
		System.out.println("Oyuncu eklendi : " + gamer.getfirstName());
		EdevletVerification.verification(gamer);
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Oyuncu Silindi : " + gamer.getfirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println("Oyuncu güncellendi : " + gamer.getfirstName());
		EdevletVerification.verification(gamer);	
	}

}
