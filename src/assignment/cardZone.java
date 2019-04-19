package assignment;

import java.util.Random;
import java.util.ArrayList;

public class cardZone{
	//fields
	protected ArrayList<Card> cardList = new ArrayList<Card>();
	public boolean visible; //make private and make getter/setter?
	protected int size;

	//constructors
	cardZone(){
		size = 0;
		visible = false;
	}
	cardZone(int s){
		size = s;
		for(int i = 0; i < size; i++) {
			cardList.add(new Card());
		}
		visible = false;
	}

	public String getLabel() {
		return label;
	}

	public void addCard(Card next) {
		cards.add(next);
	}

	//pops card at given index
	public Card popCard(int i) {
		return cards.remove(i);
	}

	//returns and removes last card
	public Card popCard() {
		int i = size() - 1;
		return popCard(i);
	}

	public int size() {
		return cards.size();
	}

	public boolean empty() {
		return cards.size() == 0;
	}

	public void deal(cardZone cards, int n) {
		for (int i = 0; i < n; i++) {
			Card card = popCard(i);
			cards.addCard(card);
		}
	}

	public Card returnLast() {
		int i = size() - 1;
		return cards.get(i);
	}

	public void swapCards(int i, int j) {
		Card temp = cards.get(i);
		cards.set(i, cards.get(j));
		cards.set(j, temp);
	}

	public void shuffle() {
		Random random = new Random();
		for (int i = size() - 1; i > 0; i--) {
			int j = random.nextInt(i);
			swapCards(i, j);
		}
	}
	
	//methods
	// what is this again?
	public boolean moveTo(cardZone cz) {
		return true;
	}

	public boolean moveCard(Card c, cardZone cz) {
		cz.cardList.add(c);
		return true;
	}

	public ArrayList<Card> checkCardZone() {
		return cardList;
	}

	public String toString() {									//temp toString
		return label + ": " + cards.toString();
	}
}
