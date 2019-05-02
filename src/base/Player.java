package base;
import cardGui.GameData;

public class Player {
	// Fields
	public String name = "";
	public Hand hand;
	private Deck drawPile;
	private cardZone playPile;
	private GameData topCard;
	
	
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
/*	public Card play(Card c) {
		return null;
	}*/
	
	public int getCard() {
		return 0;
	}
	
	// Returns the name of this player
	public String getName() {
		return name;
	}
	
	//this method will need to calculate score based on cards in hand
	public int getScore() {
		int sum = 0;
		for (int i = 0; i < hand.size(); i++) {
			Card card = hand.get(i);
			int rank = card.getNumber();
			if (rank == 8) {
				sum -= 20;
			} else if (rank > 10) {
				sum -= 10;
			} else {
				sum -= rank;
			}
		}
		return sum;
	}
	
	public String toString() {
		return name + ": " + hand.toString();
	}
}
