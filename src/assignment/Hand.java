package assignment;

// This class will create an empty hand
public class Hand extends cardZone{

	public Hand (String label) {
		super(label);
	}

	public void display() {										//method will need to be replaced with GUI connector
		System.out.println(label + ": ");
		for (Card card: cards) {
			System.out.println(card);
		}
		System.out.println();
	}

}
