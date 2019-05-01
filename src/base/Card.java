package base;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wb.swt.SWTResourceManager;


public class Card {
	// Fields
	private int suit;
	private int number;
	private Image image;
	public boolean facing;
	
	
	// Constructors
	public Card(int s, int n, boolean f) {
		suit = s;
		number = n;
		facing = f;
		// The first parameter of this may need to change as I'm not sure exactly what it does
		//temporarily just the back of a card
		image = SWTResourceManager.getImage(Card.class, "/images/" + n + '_'+ s + ".png");
		/*
		 * Aces = 0
		 * jack = 11
		 * king = 13
		 * queen = 12
		 */
	}
	
	
	// Methods
	// Changes the 'facing' value to the opposite of what it is currently
	public void flip() {
		facing = !facing;
	}
	
	// Returns the integer representation of the suit of this card
	public int getSuit() {
		return suit;
	}
	
	// what is the purpose of passing a player here?
	public int getSuit(Player p) {
		//TODO
		return suit;
	}
	
	// Returns the integer representation of the number of this card
	public int getNumber() {
		return number;
	}
	
	// Returns the image associated with this card
	public Image getImage() {
		return image;
	}
	
}
