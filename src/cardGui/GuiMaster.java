package cardGui;

import java.util.ArrayList;
import base.Hand;
import base.Card;

//import org.eclipse.swt.widgets.Composite;

public class GuiMaster {

	protected GameData data;
	
	public GuiMaster()
	{
		GuiAppWindow win = new GuiAppWindow();
		win.setState(0);
		data = new GameData();
		win.open(data);
		
//		System.out.println("In GuiMaster");
//		System.out.println("Player Count: " + data.getCount());
//		System.out.println("Player 1 name: " + data.getNames().get(0));
	}
	
	
	public void gameStart() {
		GuiAppWindow win = new GuiAppWindow();
		win.setState(0);
		data = new GameData();
		win.open(data);
	}
	
	public void turnStart(String name) {
		GuiAppWindow win = new GuiAppWindow();
		win.setState(1);
		//data = new GameData();
		data.setTurnName(name);
		win.open(data);
		
	}
	
	public int turn(String name, Hand playerHand, Card topCard, int deckSize, int discardSize) { //returns index in hand that they play, -1 if they draw a card
		GuiAppWindow win = new GuiAppWindow();
		win.setState(2);
		data.setTurnName(name);
		data.setTurnHand(playerHand);
		data.setTopCard(topCard);
		data.setDeckSize(deckSize);
		data.setDiscardSize(discardSize);
		win.open(data);
		
		return data.getChoice();
	}
	
	public int wildcard() { //returns the integer corresponding with the selected suit for their 8. This should be called when the player plays an 8
		GuiAppWindow win = new GuiAppWindow();
		win.setState(5);
		win.open(data);
		
		return data.getChoice();
	}
	
	public boolean gameEnd(String name) {
		GuiAppWindow win = new GuiAppWindow();
		win.setState(3);
		data.setTurnName(name);
		win.open(data);
		
		return data.getContinue();
	}
	
	public void message(String message) { //displays a basic dialogue box
		GuiAppWindow win = new GuiAppWindow();
		win.setState(4);
		data.setMessage(message);
		win.open(data);
		
	}
	
	public int getPlayerCount() {
		return data.getCount();
	}
	
	public ArrayList<String> getNameList()
	{
		return data.getNames();
	}
	
	
}
