package cardGui;

import java.util.ArrayList;

public class GameData {
	private ArrayList<String> players;
	private int pCount;
	
	GameData(){
		players = new ArrayList<String>();
		pCount = 0;
	}
	
	public void addName(String name) {
		players.add(name);
	}
	
	public void setCount(int c) {
		pCount = c;
	}
	
	public int getCount() {
		return pCount;
	}
	
	public ArrayList<String> getNames()
	{
		return players;
	}
}
