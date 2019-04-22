package assignment;

import java.util.ArrayList;

public class cardZone {
	// Fields
	protected ArrayList<Card> cardList = new ArrayList<Card>();
	public boolean visible; //make private and make getter/setter?
	
	// Constructors
	cardZone() {
		visible = false;	
	}
	
	cardZone(int s, boolean v) {
		cardList.ensureCapacity(s);
		visible = v;
	}
	
	
	// Methods
	// Returns true if the specified card was successfully added to this zone
	public boolean addCard(Card c) {
		//TODO
		return false;
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
	
	// ?
	public ArrayList<Card> checkCardZone() {
		return cardList;
	}
}
