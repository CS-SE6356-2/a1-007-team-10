package base;
import java.util.ArrayList;
import cardGui.*;

public class Crazy8s {
	// Fields
	private Deck drawPile;
	private cardZone playPile;
	private ArrayList<Player> players;


	// Constructor
	public Crazy8s() {
		// Initialize data objects used within the game
		playPile = new cardZone("Play Pile", true);
		drawPile = new Deck("Draw Pile");
		players = new ArrayList<Player>();
	}


	// Methods
	public void addPlayer(String name) {
		players.add(new Player(name, drawPile, playPile));
	}

	public Player getPlayer(int i) {
		return players.get(i);
	}

	// Returns the index of the given player object in the internal player list
	public int getPlayerIndex(Player player) {
		return players.indexOf(player);
	}

	// Returns true if any players hand is empty
	public boolean isDone() {
		for (int i = 0; i < players.size(); i++) {
			if (!getPlayer(i).hasCards()) {
				return true;
			}
		}

		return false;
	}

	// Returns the player object that will have the turn after the player passed to the method
	public Player nextPlayer(Player current) {
		// If the current player is not the last one
		if(getPlayerIndex(current) < players.size() - 1) {
			return getPlayer(getPlayerIndex(current) + 1);
		}

		// If the player is the last one
		if(getPlayerIndex(current) == players.size()) {
			return players.get(0);
		}

		return null;
	}

	public boolean isValid(Card played) {
		Card topCard = playPile.get(0);
		if(played.suitMatch(topCard) || played.numMatch(topCard)) {
			return true;
		}
		return false;
	}

	public boolean played8(Card played) {
		if(played.getNumber() == 7){
			return true;
		}
		return false;
	}

	// Main Method
	public static void main(String[] args) {
		GuiMaster master = new GuiMaster();
		Crazy8s game = new Crazy8s();

		// get player count
		int playerCnt = master.getPlayerCount();

		// get player names
		ArrayList<String> names = master.getNameList();
		for(int i = 0; i < playerCnt; i++) {
			game.addPlayer(names.get(i));
		}

		// Filling player hands
		// If two players, each starts with 7 cards
		if(playerCnt == 2) {
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 7; j++) {
					game.players.get(i).drawCard();
				}
			}
		} // Otherwise each starts with 5 cards
		else {
			for(int i = 0; i < playerCnt; i++) {
				for(int j = 0; j < 5; j++) {
					game.players.get(i).drawCard();
				}
			}
		}

		// First card to playPile
		game.drawPile.moveCardTo(game.drawPile.checkTop(), game.playPile);

		// Set first player
		Player cPlayer = game.players.get(0);
		//cPlayer.hand.print();

		do {
			// Print who's turn it is
			master.turnStart(cPlayer.name);

			// Index of card they play
			int choice;

			// Get player card selection
			while(true /* I dont like this */) {
                choice = master.turn(cPlayer.name, cPlayer.hand, game.playPile.get(game.playPile.size() - 1), game.drawPile.size(), game.playPile.size());

                // If they draw, keep doing the loop
                if(choice == -1) {
                    cPlayer.drawCard();
                    continue;
                }

                // Card selected
                Card move = cPlayer.hand.get(choice);

                // If an 8 is played, do not need to check for validity
                if(game.played8(move)) {
                    master.wildcard();
                }
                // Check if valid move
                else if(!game.isValid(move)) {
                    // If it is invalid, skip playing the card
                    master.message("Please select a valid move!");
                    continue;
                }

                // Play correct card
                cPlayer.playCard(move);

                // Get next player
                cPlayer = game.nextPlayer(cPlayer);

                // Valid card has been played, take next turn
                break;
			}

			/* old logic
			// If -1, card was drawn
			// Repeat until can play
			while(choice == -1) {
				cPlayer.drawCard();
				choice = master.turn(cPlayer.name, cPlayer.hand, game.playPile.get(0), game.drawPile.size(), game.playPile.size());
			}

			// Card selected
			Card move = cPlayer.hand.get(choice);

			// If an 8 is played, do not need to check for validity
			if(game.played8(move)) {
				master.wildcard();
			}
            else {
                // Check if valid move
                while(!game.isValid(move)) {
                    master.message("Please select a valid move!");

                    choice = master.turn(cPlayer.name, cPlayer.hand, game.playPile.get(0), game.drawPile.size(), game.playPile.size());
                    move = cPlayer.hand.get(choice);
                }
            }
            cPlayer.playCard(move);

			cPlayer = game.nextPlayer(cPlayer);
			*/

		} while(!game.isDone());



		// get score
		// print score with master.message()

		master.gameEnd(cPlayer.name);

	}
}
