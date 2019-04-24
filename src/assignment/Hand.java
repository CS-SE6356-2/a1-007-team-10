package assignment;


public class Hand extends cardZone {
	// Fields
	private String label;

	
	// Constructors
	public Hand(String label) {
		this.label = label;
	}
	
	public Hand(String label, int s) {
		super(s, false);
		
		this.label = label;
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
	
	public String toString() {
		return label + ": " + cardList.toString();
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
