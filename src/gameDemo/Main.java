package gameDemo;

public class Main {

	Gamer yahya = new Gamer (1, "yahya", "erdogan", "1234567");
	
	Campaign campaign = new Campaign (1, "50% discount");
	
	GamerManager gamerManager= new GamerManager(new CheckingManager());
	
	GameSellManager gameSellManager = new GameSellManager();
	
	gamerManager.add(yahya);
	
	gameSellManager.sellGame(yahya, new Game(1, "gameName", campaign));
	
}
