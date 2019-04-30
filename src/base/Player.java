package base;

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
	
	public Player (String n, Deck dp, cardZone pp) {
		name = n;
		hand = new Hand(n, false);
		drawPile = dp;
		playPile = pp;
	}
	
	
	// Methods
	// Returns true if the specified card exists and was moved successfully to the playPile, false if the card is not in this player's hand
	public boolean playCard(Card c) {
		
		return hand.moveCardTo(c, playPile);
	}
	
	// Returns true if successfully drew a card from the deck
	public boolean drawCard() {
		return drawPile.draw(hand);
	}
	
	public boolean hasCards() {
		return !hand.empty();
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
	
	//this method will need to calculate score based on cards in hand
	public int getScore() {
		//TODO
		return -1;
	}
	
	public String toString() {
		return name + ": " + hand.toString();
	}
}
