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
	private Card
	
	GameData(){
		players = new ArrayList<String>();
		pCount = 0;
		turnName = "Default Name";
		turnHand = new Hand();
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
}
