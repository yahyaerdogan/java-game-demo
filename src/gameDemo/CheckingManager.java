package gameDemo;

public class CheckingManager implements Checking {

	@Override
	public void verify(Gamer gamer) {
		
		System.out.println("check successful: "+ gamer.getFirstName()+ " " + gamer.getLastName());
	}

}
