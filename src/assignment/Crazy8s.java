package assignment;
import java.util.ArrayList;
import java.util.Scanner;

// why are there multiple Crazy8s instances being created within this class?
// this is a bare-bones text based user interface for later merging/testing purposes
public class Crazy8s {
	// Fields
	// action event listener variables and methods will need to be added
	private Hand drawPile;
	private Hand discardPile;
	private Scanner in;
	private ArrayList<Player> players;
	
	
	// Constructor
	public Crazy8s() {
		Deck deck = new Deck();
		deck.shuffle();

		this.discardPile = new Hand("Discard Pile", false);
		deck.deal(discardPile, 1);

		drawPile = new Hand("Draw new card", false);
		deck.dealAll(drawPile);

		in = new Scanner(System.in);
	}
	
	
	// Methods
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	// ?
	public void drawCards() {
		//Object player = null;
		//drawPile.deal(((Player) player).getHand(), 5);
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
		for (int x = 0; x < players.size(); x++) {
			if (getPlayer(x).getHand().empty()) {
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
		
		/*
		none of this should be accessible, right?
		 
		discardPile.display();
		System.out.print("Draw pile: ");
		System.out.println(drawPile.size() + " cards");
		*/
		
		return null;
	}
	
	// ?
	public void waitForUser() {
		in.nextLine();
	}
	
	// Computer or human player takes next turn
	//nani?
	public void takeTurn(Player player) {
		Card convert = discardPile.returnLast();

		Crazy8s prev = new Crazy8s();
		prev = prev.convert(convert);

		//Crazy8s next = player.play(this, prev);
		//discardPile.addCard(next);

		//System.out.println(player.getName() + " plays " + next);
	}
	
	// ?
	private Crazy8s convert(Card convert) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// User plays game
	//this will need to be replaced with GUI
	public void playGame() {
		System.out.println("Crazy Eights!");
		System.out.println("Enter number of players(2-4): ");
		
		int numOfPlayers = in.nextInt();
		while(numOfPlayers > 4 || numOfPlayers < 2) {
			System.err.println("Error: Number of players must be between 2 and 4.");
			System.out.println("Enter number of players again: ");
			numOfPlayers = in.nextInt();
		}
		
		for(int i = 0; i < numOfPlayers; i++) {
			// this needs the data for each player
			players.add(new Player());
		}
		
		Player player = getPlayer(0);
		
		// Main game loop
		while(!isDone()) {
			displayState();
			waitForUser();
			takeTurn(player);
			player = nextPlayer(player);
		}

		//what is this supposed to do?
		for(int i = 0; i < players.size(); i++) {
			getPlayer(i).getName();
		}
	}
	
	// ?
	private void displayState() {

	}

	public static void main(String[] args) {
		Crazy8s game = new Crazy8s();
		game.playGame();
	}
}
