package assignment;
import java.util.ArrayList;
import java.util.Scanner;

public class Crazy8s { 				// action event listener variables and methods will need to be added
	private Hand drawPile; 			// this is a barebones text based user interface for later merging/testing purposes
	private Hand discardPile;
	private Scanner in;
	private Player players;

	public Crazy8s() {
		Deck deck = new Deck();
		deck.shuffle();

		this.players = new Hand("Discard Pile");
		deck.deal(discardPile, 1);

		drawPile = new Hand("Draw new card");
		deck.dealAll(drawPile);

		in = new Scanner(System.in);
	}

	public void createPlayer(Crazy8s player) {
		player.add(player);
	}

	private void add(Crazy8s player) {

	}

	public void drawCards() {
		Object player = null;
		drawPile.deal(((Player) player).getHand(), 5);
	}

	public Player getPlayer(int i) {
		return players.get(i);
	}

	public int getPlayerIndex(Player player) {
		return players.indexOf(player);
	}

	public boolean isEmpty() {
		for (int x = 0; x < players.size(); x++) {
			if (((Hand) getPlayer(x).getHand).empty()) {
				return true;
			}
		}
		return false;
	}

	  public boolean isDone() {
		    for (int x = 0; x < players.size(); x++) {
		      if (getPlayer(x).getHand().empty()) {
		        return true;
		      }
		    }
		    return false;
		  }

	public Player nextPlayer(Player player) {
		if (getPlayerIndex(player) < players.size() - 1) {
			return getPlayer(getPlayerIndex(player) + 1);
		}
		if (getPlayerIndex(player) == players.size() - 1) {
			int x = 0;
			return getPlayer(x).display();
		}
		discardPile.display();
		System.out.print("Draw pile: ");
		System.out.println(drawPile.size() + " cards");
		return players;
	}

	public void waitForUser() {
		in.nextLine();
	}

	// computer or human player takes next turn
	public void takeTurn(Player player) {
		Card convert = discardPile.returnLast();

		Crazy8s prev = new Crazy8s();
		prev = prev.convert(convert);

		Crazy8s next = player.play(this, prev);
		discardPile.addCard(next);

		System.out.println(player.getName() + " plays " + next);
	}

	private Crazy8s convert(Card convert) {
		// TODO Auto-generated method stub
		return null;
	}

	// user plays game
	// this will need to be replaced with GUI
	public void playGame() {
		System.out.println("Crazy Eights!");
		System.out.println("Enter number of players(2-4): ");

		int numOfPlayers = in.nextInt();
		while (numOfPlayers > 4 || numOfPlayers < 2) {
			System.err.println("Error: Number of players must be between 2 and 4.");
			System.out.println("Enter number of players again: ");
			numOfPlayers = in.nextInt();
		}

		for (int i = 0; i < numOfPlayers; i++) {
			Player player = new Player();
		}
		Player player = getPlayer(0);

		while (!isDone()) {
			displayState();
			waitForUser();
			takeTurn(player);
			player = nextPlayer(player);
		}

		for (int x = 0; x < players.size(); x++) {
			getPlayer(x).display();
		}
	}

	private void displayState() {

	}

	public static void main(String[] args) {
		Crazy8s game = new Crazy8s();
		game.playGame();
	}
}
