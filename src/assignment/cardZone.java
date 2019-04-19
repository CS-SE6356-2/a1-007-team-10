package assignment;

import java.util.ArrayList;

public class cardZone {
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
	
	
	//methods
	// what is this again?
	//public boolean moveTo(cardZone cz) {
		//return true;
	//}
	
	public boolean moveCard(Card c, cardZone cz) {
		cz.cardList.add(c);
		return true;
	}
	
	public ArrayList<Card> checkCardZone() {
		return cardList;
	}
}
