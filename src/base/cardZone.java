package base;
import java.util.ArrayList;


public class cardZone {
	// Fields
	protected ArrayList<Card> cardList;
	protected String label;
	public boolean visible; //make private and make getter/setter?
	
	
	// Constructors
	//should eventually be deleted
	cardZone() {
		System.out.println("cardZone constructor should be called with arguments.");
		cardList = new ArrayList<Card>();
		label = "";
		visible = false;
	}
	
	cardZone(String l, boolean v) {
		cardList = new ArrayList<Card>();
		label = l;
		visible = v;
	}
	
	
	// Methods
	// Returns true if the specified card was successfully added to this zone
	public boolean addCard(Card c) {
		return cardList.add(c);
	}
	
	// Moves all cards from this zone to the specified zone
	public boolean moveAllTo(cardZone cz) {
		//TODO
		return false;
	}
	
	// Returns true if the specified card exists and was moved to the specified zone, false otherwise
	public boolean moveCardTo(Card c, cardZone cz) {
		//TODO
		return false;
	}
	
	// Return the number of cards in the list
	public int size() {
		return cardList.size();
	}
	
	// Returns true if the card list contains no cards
	public boolean empty() {
		return cardList.size() == 0;
	}
	
	public String toString() {
		return label + ": " + cardList.toString();
	}
}
