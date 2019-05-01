package cardGui;

import java.util.ArrayList;
import base.Hand;
import base.Card;

//import org.eclipse.swt.widgets.Composite;

public class GuiMaster {

	GameData data;
	public GuiMaster()
	{
		GuiAppWindow win = new GuiAppWindow();
		win.setState(0);
		data = new GameData();
		win.open(data);
		
		System.out.println("In GuiMaster");
		System.out.println("Player Count: " + data.getCount());
		System.out.println("Player 1 name: " + data.getNames().get(0));
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
	
	public int turn(String name, Hand playerHand, Card topCard) { //returns index in hand that they play, -1 if they draw a card
		GuiAppWindow win = new GuiAppWindow();
		win.setState(2);
		data.setTurnName(name);
		data.setTurnHand(playerHand);
		win.open(data);
		
		return -1; //TODO
	}
	
	public int getPlayerCount() {
		return data.getCount();
	}
	
	public ArrayList<String> getNameList()
	{
		return data.getNames();
	}
	
}
