
public class Gamer {

	String identificationNumber;
	String firstName;
	String lastName;
	int birthYear;
	
	public Gamer() {
	
	}
	
	public Gamer(String identificationNumber, String firstName, String lastName, int birthYear) {
		super();
		this.identificationNumber = identificationNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
}
