package assignment;
import java.util.Random;


public class Deck extends cardZone {
	// Fields
	// Why are these stored, shouldn't we just call cardList.remove(0) or cardList.remove(size-1) when we want one of those two?
	private Card topCard;
	//do we need this anymore?
	private Card bottomCard;
	
	
	// Constructor
	Deck() {
		super(52, true);
		fill();
		
		topCard = cardList.get(0);
		// If the deck is empty for any reason, this can throw an IndexOutOfBounds error
		bottomCard = cardList.get(cardList.size() - 1);
	}
	
	
	// Methods
	// Helper method to create a new set of 52 cards to add to the card list
	private void fill() {
		// Loop for each suit
		for(int suit = 0; suit < 4; suit++) {
			// Loop for each number
			for(int number = 0; number < 13; number++) {
				// Add the card to the list
				cardList.add( new Card(suit, number, false) );
			}
		}
	}
	
	// Moves the top card of this deck into the specified hand
	public boolean draw(Hand hand) {
		Card c = cardList.remove(0); //something
		
		return hand.addCard(c);
	}
	
	// this shouldn't be necessary, see comment at top
	// ?
	public Card checkTop(Player player) {
		//TODO
		return topCard;
	}
	
	// this shouldn't be necessary, see comment at top
	// ?
	public Card checkBottom(Player player) {
		//TODO
		return bottomCard;
	}
	
	// Puts the cards in cardList in a random ordering using a Fisher Yates shuffle
	public void shuffle() {
		int index;
		Card temp;
	    Random random = new Random();

	    for (int i = cardList.size(); i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        temp = cardList.get(index);
	        cardList.set(index, cardList.get(i));
	        cardList.set(i, temp);
	    }
	}
	
	//methods for connecting to discardPile and drawPile
	// ?
	public void deal(Hand discardPile, int i) {
		//TODO
	}
	
	// ?
	public void dealAll(Hand drawPile) {
		//TODO
	}
	
}
