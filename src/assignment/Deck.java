package assignment;

import java.util.Random;

public class Deck extends cardZone{
	//fields
	private Card topCard;
	private Card bottomCard; // do we need this anymore?
	
	//constructor
	Deck(){
		topCard = cardList.get(0);
		bottomCard = cardList.get(size-1);
	}
	
	//methods
	public Card checkTop(Player player) {
		return topCard;
	}
	
	// a fisher yates shuffle
	private void shuffle() {
		int index;
		Card temp;
	    Random random = new Random();
	    for (int i = cardList.size(); i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        temp = cardList.get(index);
	        cardList.set(index, cardList.get(i));
	        cardList.set(i, temp);
	    }
	}
	
	// what is this again?
	private void fill() {
		
	}
	
}
