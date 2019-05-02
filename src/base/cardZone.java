package base;
import java.util.ArrayList;


public class cardZone {
	// Fields
	protected ArrayList<Card> cardList;
	protected String label;
	private boolean visible;


	// Constructors
	// Should eventually be deleted
	cardZone() {
		//System.out.println("cardZone constructor should be called with arguments.");
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
	// Setter and getter for visibility
	public void setVisible(boolean v) {
		visible = v;
	}

	public boolean getVisible() {
		return visible;
	}

	// Returns true if the specified card was successfully added to this zone
	public boolean addCard(Card c) {
		return cardList.add(c);
	}

	/*// Moves all cards from this zone to the specified zone
	public boolean moveAllTo(cardZone cz) {
		//TODO
		return false;
	}*/

	// Returns true if the specified card exists and was moved to the specified zone, false otherwise
	public boolean moveCardTo(Card c, cardZone cz) {
		// Check if in cardList
		for(int i = 0; i < size(); i++) {
            if(cardList.get(i) == c) {
                Card tmp = cardList.remove(i);

                return cz.addCard(tmp);
            }
		}
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

	// Print each card to the console
	public void print() {
		//return label + ": " + cardList.toString();
		for(int i = 0; i < size(); i++) {
            System.out.println(cardList.get(i).getNumber() + ", " + cardList.get(i).getSuit());
		}
	}

	//Returns the card object at the specified index
	public Card get(int i) {
		return cardList.get(i);
	}
}
