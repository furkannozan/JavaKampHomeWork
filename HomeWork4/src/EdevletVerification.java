
public class EdevletVerification {
	
	public static boolean verification(Gamer gamer) {
		
		if(!gamer.identificationNumber.isEmpty() && !gamer.firstName.isEmpty() && !gamer.lastName.isEmpty() && gamer.birthYear>1990) {
			
			System.out.println("Do�rulama yap�ld� ");
			return true;
		}else {
			System.out.println("Yanl�� bilgi girildi.");
		return false;
		}
		
	}
	

}
