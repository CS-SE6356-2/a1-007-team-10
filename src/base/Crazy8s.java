package base;
import java.util.ArrayList;
import java.util.Scanner;

public class Crazy8s {
	// Fields
	private Hand drawPile;
	private Hand discardPile;
	private Scanner in;
	private ArrayList<Player> players;


	// Constructor
	public Crazy8s() {
		Deck deck = new Deck();
		deck.shuffle();

		discardPile = new Hand("Discard Pile", false);
		deck.fill(discardPile);

		drawPile = new Hand("Draw new card", false);
		deck.fill(drawPile);

		in = new Scanner(System.in);
	}


	// Methods
	public void addPlayer(Player player) {
		players.add(player);
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
		for (int x = 0; x < players.size(); x++) {
			if (getPlayer(x).getHand().empty()) {
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

	// ?
	public void waitForUser() {
		in.nextLine();
	}

//TODO: Will make placed card decision if playing against CPU
	public void takeTurn(Player player) {
		Card convert = discardPile.returnLast();

		Crazy8s prev = new Crazy8s();
		prev = prev.convert(convert);

		//Crazy8s next = player.play(this, prev);
		//discardPile.addCard(next);

		//System.out.println(player.getName() + " plays " + next);
	}

	// User plays game
	public void playGame() {
		//TODO: Connects with GUI instead of printing text
		System.out.println("Crazy Eights!");
		System.out.println("Enter number of players(2-4): ");

		int numOfPlayers = in.nextInt();
		while(numOfPlayers > 4 || numOfPlayers < 2) {
			System.err.println("Error: Number of players must be between 2 and 4.");
			System.out.println("Enter number of players again: ");
			numOfPlayers = in.nextInt();
		}

		for(int i = 0; i < numOfPlayers; i++) {
			// this needs the data for each player
			players.add(new Player());
		}

		Player player = getPlayer(0);

		// Main game loop
		while(!isDone()) {
			displayState();
			waitForUser();
			takeTurn(player);
			player = nextPlayer(player);
		}

		//what is this supposed to do?
		//this loop should return final score once one player has an empty hand
		//Player class needs displayScore method to send data to GUI
		for(Player players : players.getSize()) {
			players.displayScore();
		}
	}

	public static void main(String[] args) {
		Crazy8s game = new Crazy8s();
		game.playGame();
	}
}
