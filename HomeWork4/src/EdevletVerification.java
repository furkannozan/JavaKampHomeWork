
public class EdevletVerification {
	
	public static boolean verification(Gamer gamer) {
		
		if(!gamer.identificationNumber.isEmpty() && !gamer.firstName.isEmpty() && !gamer.lastName.isEmpty() && gamer.birthYear>1990) {
			
			System.out.println("Doðrulama yapýldý ");
			return true;
		}else {
			System.out.println("Yanlýþ bilgi girildi.");
		return false;
		}
		
	}
	

}
