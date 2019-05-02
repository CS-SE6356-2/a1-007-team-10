package base;
import java.util.ArrayList;
import cardGui.*;

public class Crazy8s {
	// Fields
	private Deck drawPile;
	private cardZone playPile;
	private ArrayList<Player> players;
	
	
	// Constructor
	public Crazy8s() {
		// Initialize data objects used within the game
		playPile = new cardZone("Play Pile", true);
		drawPile = new Deck("Draw Pile");
		players = new ArrayList<Player>();
	}
	
	
	// Methods
	public void addPlayer(String name) {
		players.add(new Player(name, drawPile, playPile));
	}
	
	public Player getPlayer(int i) {
		return players.get(i);
	}
	
	// Returns the index of the given player object in the internal player list
	public int getPlayerIndex(Player player) {
		return players.indexOf(player);
	}
	
	// Returns true if any players hand is empty
	public boolean isDone() {
		for (int i = 0; i < players.size(); i++) {
			if (getPlayer(i).hasCards()) {
				return true;
			}
		}
		
		return false;
	}
	
	// Returns the player object that will have the turn after the player passed to the method
	public Player nextPlayer(Player current) {
		// If the current player is not the last one
		if(getPlayerIndex(current) < players.size() - 1) {
			return getPlayer(getPlayerIndex(current) + 1);
		}
		
		// If the player is the last one
		if(getPlayerIndex(current) == players.size()) {
			return players.get(0);
		}
		
		return null;
	}
	
	
	
	// Main Method
	public static void main(String[] args) {
		Crazy8s game = new Crazy8s(); 
		GuiMaster master = new GuiMaster();
		//System.out.println(master.getPlayerCount()/* + ' ' + master.getNameList().get(0)*/);
		//master.turnStart("nametest");
		//master.message("This is my test message This is my test message This is my test message This is my test message ");
		
		// get player count
		int playerCount = master.getPlayerCount();
		
		// get player names
		ArrayList<String> names = master.data.getNames();
		for(int i = 0; i < playerCount; i++) {
			game.addPlayer(names.get(i)); 
		}
		
		// Filling player decks
		// if two players, each starts with 7 cards
		if( playerCount == 2) {
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 7; j++) {
					game.drawPile.draw(game.players.get(i).hand);
				}
			}
		} // otherwise each starts with 5 cards
		else {
			for(int i = 0; i < playerCount; i++) {
				for(int j = 0; j < 5; j++) {
					game.drawPile.draw(game.players.get(i).hand);
				}
			}
		}
		// Main game loop
		while(!game.isDone()) {
			//master.nextState();
		}
	}
}
