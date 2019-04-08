package assignment;

public class Card {
	private int suit;
	private int number;
	public boolean facing;
	
	public Card() {
		// ...
	}
	
	public Card(int s, int n, boolean f) {
		suit = s;
		number = n;
		facing = f;
	}
	
	
	// should be named 'flip'
	public void Flip() {
		// do stuff
	}
	
	// the following three methods should be renamed as 'getSuit' or 'getNumber'
	public int CheckSuit() {
		
		return suit;
	}
	// what is the purpose of passing a player here?
	public int CheckSuit(Player p) {
		
		return suit;
	}
	
	public int CheckNumber() {
		return number;
	}
	
}
