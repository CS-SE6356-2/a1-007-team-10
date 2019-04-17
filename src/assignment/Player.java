package assignment;

public class Player {
	public String name = "";
	public Hand hand;
	private Deck drawPile;
	private Deck playPile;
	
	
	public Player() {
		System.out.println("Player constructor should be called with arguments.");
	}
	
	public Player (String n, Hand h, Deck dp, Deck pp) {
		name = n;
		hand = h;
		drawPile = dp;
		playPile = pp;
	}
	
	
	// should be named 'moveCard'
	public boolean MoveCard(Card c, cardZone from, cardZone to) {


		return false;
	}
	
	// Returns ... something?
	public int size() {
		return -1;
	}
	
	// Returns the Hand object associated with this player
	public Hand getHand() {
		return hand;
	}
	
	// Returns the card the player decided to play
	// Should interface with the GUI
	public Card play() {
		return null;
	}
	
	// Returns the name of this player
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + ": " + hand.toString();
	}
}
