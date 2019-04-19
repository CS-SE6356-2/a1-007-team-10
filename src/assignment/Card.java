package assignment;

public class Card {
	private int suit;
	private int number;
	public boolean facing;
	//private Image pic;

	
	// This constructor should not be called
	public Card() {}

	public Card(int s, int n, boolean f) {
		suit = s;
		number = n;
		facing = f;
		//get image
	}
	
	
	// Changes the 'facing' value to the opposite of what it is currently
	public void flip() {
		facing = !facing;
	}

	// the following three methods should be renamed as 'getSuit' or 'getNumber'
	// Returns the integer representation of the suit of this card
	public int getSuit() {
		return suit;
	}
	// what is the purpose of passing a player here?
	public int getSuit(Player p) {

		return suit;
	}

	// Returns the integer representation of the number of this card
	public int getNumber() {
		return number;
	}
	
	// Returns the image associated with this card
	public void/*Image*/ getImage() {
		//return image;
	}

}
