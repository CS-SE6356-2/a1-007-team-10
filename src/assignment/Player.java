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

	public Player (String n) {
		this.name = n;
		this.hand = new Hand(n);
		//drawPile = dp;
		//playPile = pp;
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
	// idk if this is needed
	// public int size() {
	// 	return -1;
	// }

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

	//this method will need to calculate score based on cards in hand
	public int score() {
		return 0;
	}

	public int getScore() {
		return 0;
	}

	// returns hand to display
	public void display() {
		hand.display();
	}

	public String toString() {
		return name + ": " + hand.toString();
	}
}
