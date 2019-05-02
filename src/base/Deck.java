package base;
import java.util.Random;


public class Deck extends cardZone {
	// Fields
	private Card topCard;
	private Card bottomCard;
	
	
	// Constructor
	//should eventually be deleted
	Deck() {
		super();
		
		fill();
		shuffle();
		topCard = cardList.get(0);
		// If the deck is empty for any reason, this can throw an IndexOutOfBounds error
		bottomCard = cardList.get(cardList.size() - 1);
	}
	
	Deck(String l) {
		super(l, true);
		fill();
		shuffle();
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
		Card c = cardList.remove(0); 
		
		return hand.addCard(c);
	}
	

	public Card checkTop() {
		topCard = cardList.get(0);
		return topCard;
	}
	

	public Card checkBottom() {
		bottomCard = cardList.get(cardList.size() - 1);
		return bottomCard;
	}
	
	// Puts the cards in cardList in a random ordering using a Fisher Yates shuffle
	public void shuffle() {
		int index;
		Card temp;
	    Random random = new Random();
	    
	    for (int i = cardList.size() - 1; i > 0; i--)
	    {
	        index = random.nextInt(i);
	        temp = cardList.get(index);
	        cardList.set(index, cardList.get(i));
	        cardList.set(i, temp);
	    }
	}
}
