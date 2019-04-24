package assignment;


public class Hand extends cardZone {
	// Fields
	
	
	// Constructors
	//should eventually be deleted
	public Hand() {
		super();
	}
	
	public Hand(String l, boolean v) {
		super(1, l, v);
	}
	
	public Hand(int s, String l, boolean v) {
		super(s, l, v);
	}
	
	
	// Methods
	// Returns the label associated with this Hand
	public String getName() {
		return label;
	}
	
	// ?
	public Card getCard(int i) {
		return cardList.get(i);
	}
	
	// ?
	public Card removeCard(int i) {
		return cardList.remove(i);
	}
	
	// ?
	public Card returnLast() {
		int i = cardList.size() - 1;
		return cardList.get(i);
	}
	
	// ?
	public void swapCards(int i, int j) {
		Card temp = cardList.get(i);
		cardList.set(i, cardList.get(j));
		cardList.set(j, temp);
	}
	
	//method will need to be replaced with GUI connector
	// ?
	public void display() {
		System.out.println(label + ": ");
		for (Card card: cardList) {
			System.out.println(card);
		}
		System.out.println();
	}
	
}
