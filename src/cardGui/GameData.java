package cardGui;

import java.util.ArrayList;
import base.Hand;
import base.Card;

//Used to transport data from the interface to Crazy8

public class GameData {
	private ArrayList<String> players;
	private int pCount;
	private String turnName;
	private Hand turnHand;
	private Card topCard;
	private int turnChoice;
	private int deckSize;
	private int discardSize;
	private String message;
	
	GameData(){
		players = new ArrayList<String>();
		pCount = 0;
		turnName = "Default Name";
		turnHand = null;
		topCard = null;
		turnChoice = 0;
		deckSize = 0;
		discardSize = 0;
		message = "";
	}
	
	//Setters
	public void addName(String name) {
		players.add(name);
	}
	
	public void setCount(int c) {
		pCount = c;
	}
	
	public void setTurnName(String s) {
		turnName = s;
	}
	
	public void setTurnHand(Hand h) {
		turnHand = h;
	}
	
	public void setTopCard(Card c) {
		topCard = c;
	}
	
	public void setChoice(int i) {
		turnChoice = i;
	}
	
	public void setDeckSize(int s) {
		deckSize = s;
	}
	
	public void setDiscardSize(int s) {
		discardSize = s;
	}
	
	public void setMessage(String m) {
		message = m;
	}
	//Getters
	public int getCount() {
		return pCount;
	}
	
	public ArrayList<String> getNames()
	{
		return players;
	}
	
	public String getTurnName() {
		return turnName;
	}
	
	public Hand getHand() {
		return turnHand;
	}
	
	public Card getTopCard() {
		return topCard;
	}
	
	public int getChoice() {
		return turnChoice;
	}
	
	public int getDeckSize() {
		return deckSize;
	}
	
	public int getDiscardSize() {
		return discardSize;
	}
	public String getMessage() {
		return message;
	}
}
