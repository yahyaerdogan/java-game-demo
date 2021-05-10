package gameDemo;

public class Gamer {
	
	private int id;
	private String firstName;
	private String lastName;
	private String nationalId;
	
	public Gamer(int id, String firstName, String lastName, String nationalId) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.nationalId=nationalId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	
	

}
