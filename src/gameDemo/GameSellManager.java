package gameDemo;

public class GameSellManager {

	public void sellGame(Gamer gamer, Game game, Campaign campaign) {
		
		System.out.println("campaign: " + campaign.getDescription());
		System.out.println("game: " + game.getName());
		System.out.println("gamer: " + gamer.getFirstName() + " " + gamer.getLastName());
	}
}
