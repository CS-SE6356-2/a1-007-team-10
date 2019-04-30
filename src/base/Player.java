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
	
	/* replaced by below
	// Returns the Hand object associated with this player
	public Hand getHand() {
		return hand;
	}
	*/
	public boolean hasCards() {
		return hand.size() > 0;
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
	
/*	not creating cpu's
	//takes turn for player if playing against PC
	// Should interface with the GUI
	public Card play(Crazy8s game, Card prev) {
			Card card = searchForMatch(prev);
			if (card == null) {
					card = drawTill(game, prev);
			}
			return card;
	}
	
	
	//searches player's hand for matching card
	public Card searchForMatch(Card prev) {
		return null;
	}
	
	//adds max 3 cards to hand if hand does not contain match
	public Card drawTill(crazy8s game, Card prev) {
		return null;
	}
	
	//compares cards to see if they match
	public static boolean cardMatch(Card card1, Card card2) {
		return false;
	}
	*/
	
	//this method will need to calculate score based on cards in hand
	public int getScore() {
		//TODO
		return -1;
	}
	
	/* unnecessary
	// returns hand to display
	public void display() {
		hand.display();
	}
	*/
	
	public String toString() {
		return name + ": " + hand.toString();
	}
}
