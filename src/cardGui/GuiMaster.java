package cardGui;

import java.util.ArrayList;

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
	
	public int getPlayerCount() {
		return data.getCount();
	}
	
	public ArrayList<String> getNameList()
	{
		return data.getNames();
	}
	
}
