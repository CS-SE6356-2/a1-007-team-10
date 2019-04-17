package assignment;

public class Card {
	private int suit;
	private int number;
	public boolean facing;

	
	// This constructor should not be called
	public Card() {}

	public Card(int s, int n, boolean f) {
		suit = s;
		number = n;
		facing = f;
	}


	// should be named 'flip'
	// Changes the 'facing' value to the opposite of what it is currently
	public void Flip() {
		facing = !facing;
	}

	// the following three methods should be renamed as 'getSuit' or 'getNumber'
	// Returns the integer representation of the suit of this card
	public int CheckSuit() {
		return suit;
	}
	// what is the purpose of passing a player here?
	public int CheckSuit(Player p) {

		return suit;
	}

	// Returns the integer representation of the number of this card
	public int CheckNumber() {
		return number;
	}

}
