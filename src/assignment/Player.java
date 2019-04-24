package assignment;

public class Player {
	// Fields
	public String name = "";
	public Hand hand;
	private Deck drawPile;
	private cardZone playPile;
	
	
	// Constructors
	// This constructor should not be called
	public Player() {
		System.out.println("Player constructor should be called with arguments.");
	}
	
	public Player (String n, Hand h, Deck dp, cardZone pp) {
		name = n;
		hand = h;
		drawPile = dp;
		playPile = pp;
	}
	
	
	// Methods
	// Returns true if the specified card exists and was moved successfully to the playPile, false if the card is not in this player's hand
	public boolean playCard(Card c) {
		
		return false;
	}
	
	// Returns true if successfully drew a card from the deck
	public boolean drawCard() {
		return drawPile.draw(hand);
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
