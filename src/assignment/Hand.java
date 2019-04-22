package assignment;
import java.util.ArrayList;
import java.util.Random;

public class Hand extends cardZone{
	private String label;
	private ArrayList<Card> cards;

	public Hand (String label) {
		this.label = label;
		this.cards = new ArrayList<Card>();
	}
	
	
	// ?
	public String getValue() {
		return label;
	}
	
	// ?
	public Card getCard(int i) {
		return cards.get(i);
	}
	
	// ?
	public Card popCard(int i) {
		return cards.remove(i);
	}
	
	// ?
	public int size() {
		return cards.size();
	}
	
	// ?
	public boolean empty() {
		return cards.size() == 0;
	}
	
	// ?
	public void deal(Hand that, int n) {
		for (int i = 0; i < n; i++) {
			Card card = popCard(i);
			that.addCard(card);
		}
	}
	
	// ?
	public Card returnLast() {
		int i = size() - 1;
		return cards.get(i);
	}
	
	// ?
	public void swapCards(int i, int j) {
		Card temp = cards.get(i);
		cards.set(i, cards.get(j));
		cards.set(j, temp);
	}
	
	// ?
	public void shuffle() {
		Random random = new Random();
		for (int i = size() - 1; i > 0; i--) {
			int j = random.nextInt(i);
			swapCards(i, j);
		}
	}
	
	public String toString() {
		return label + ": " + cards.toString();
	}
	
	//method will need to be replaced with GUI connector
	// ?
	public void display() {
		System.out.println(label + ": ");
		for (Card card: cards) {
			System.out.println(card);
		}
		System.out.println();
	}
	
}
