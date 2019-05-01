package cardGui;

import org.eclipse.swt.widgets.Composite;

public class GuiObject extends Composite{

	protected GameData data;
	
	public GuiObject(Composite parent, int style) {
		super(parent, style);
		data = new GameData();
	}
	
	public GameData getGameData() {
		return this.data;
	}

}
