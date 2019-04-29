package cardGui;

import java.util.ArrayList;

//import org.eclipse.swt.widgets.Composite;

public class GuiMaster {

	GameData data;
	public GuiMaster()
	{
		GuiAppWindow win = new GuiAppWindow();
		win.setState(0);
		data = win.open();
	}
	
	public void gameStart() {
		GuiAppWindow win = new GuiAppWindow();
		win.setState(0);
		data = win.open();
	}
	
	public int getPlayerCount() {
		return data.getCount();
	}
	
	public ArrayList<String> getNameList()
	{
		return data.getNames();
	}
	
}
