package assignment;

import org.eclipse.swt.graphics.Image;
import org.eclipse.wb.swt.SWTResourceManager;

public class Card {
	private int suit;
	private int number;
	private Image image;
	public boolean facing;
	
	
	// This constructor should not be called
	public Card() {
		System.out.println("Card constructor should be called with arguments.");
	}
	
	public Card(int s, int n, boolean f) {
		suit = s;
		number = n;
		facing = f;
		// The first parameter of this may need to change as I'm not sure exactly what it does
		image = SWTResourceManager.getImage(Card.class, "/testImages/tempCard.png");
	}
	
	
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
