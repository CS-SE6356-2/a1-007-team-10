package assignment;

// This class should be used to only create a standard deck of cards
public class Deck extends cardZone{
	//fields
	//private Card topCard;
	//private Card bottomCard; // do we need this anymore?

	//constructor
	public Deck(String label){
		super(label);

		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				addCard(new Card(rank, suit));
			}
		}
		// topCard = cardList.get(0);
		// bottomCard = cardList.get(size-1);
	}

	public void shuffle() {
		Random random = new Random();
		for (int i = size() - 1; i > 0; i--) {
			int j = random.nextInt(i);
			swapCards(i, j);
		}
	}

	//methods
	// cardZone can accomplish this method
	// public Card checkTop(Player player) {
	// 	return topCard;
	// }

	// a fisher yates shuffle
	// needs a toString method to return back to crazy8s
	// why do we need this shuffle method since theres already one in cardZone
	// public void shuffle() {
	// 	int index;
	// 	Card temp;
	//     Random random = new Random();
	//     for (int i = cardList.size(); i > 0; i--)
	//     {
	//         index = random.nextInt(i + 1);
	//         temp = cardList.get(index);
	//         cardList.set(index, cardList.get(i));
	//         cardList.set(i, temp);
	//     }
	// }
}
