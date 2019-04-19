package assignment;
import java.util.ArrayList;
import java.util.Random;

public class Hand extends cardZone{
	private String label;
	//should not need new cards if extending cardZone
	//private ArrayList<Card> cards;

	public Hand (String label) {
		this.label = label;
		//this.cards = new ArrayList<Card>();
	}

	public String getValue() {
		return label;
	}

	public Card getCard(int i) {
		return cardList.get(i);
	}

	public void addCard(Card next) {
		cardList.add(next);
	}

	public Card popCard(int i) {
		return cardList.remove(i);
	}

	public int size() {
		return cardList.size();
	}

	public boolean empty() {
		return cardList.size() == 0;
	}

	public void deal(Hand that, int n) {
		for (int i = 0; i < n; i++) {
			Card card = popCard(i);
			that.addCard(card);
		}
	}

	public Card returnLast() {
		int i = size() - 1;
		return cardList.get(i);
	}

	public void swapCards(int i, int j) {
		Card temp = cardList.get(i);
		cardList.set(i, cardList.get(j));
		cardList.set(j, temp);
	}

	public void shuffle() {
		Random random = new Random();
		for (int i = size() - 1; i > 0; i--) {
			int j = random.nextInt(i);
			swapCards(i, j);
		}
	}

	public String toString() {									//temp toString
		return label + ": " + cardList.toString();
	}

	public void display() {										//method will need to be replaced with GUI connector
		System.out.println(label + ": ");
		for (Card card: cardList) {
			System.out.println(card);
		}
		System.out.println();
	}

}
