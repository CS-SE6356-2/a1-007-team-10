package cardGui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class GuiGameStart extends GuiObject {
	private Text p1Name;
	private Text p2Name;
	private Text p3Name;
	private Text p4Name;
	private int playerCount;
	//public GameData data;
	//private boolean wait = true;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GuiGameStart(Composite parent, int style, GameData data) {
		super(parent, style);
		setLayout(null);
		
		Label label = new Label(this, SWT.NONE);
		label.setBounds(10, 10, 55, 15);
		label.setText("Crazy 8s");
		
		Label lblPlayer = new Label(this, SWT.NONE);
		lblPlayer.setBounds(259, 62, 85, 15);
		lblPlayer.setText("Player 1 Name:");
		
		p1Name = new Text(this, SWT.BORDER);
		p1Name.setBounds(350, 59, 273, 21);
		
		Label lblPlayerName = new Label(this, SWT.NONE);
		lblPlayerName.setBounds(259, 104, 85, 15);
		lblPlayerName.setText("Player 2 Name:");
		
		p2Name = new Text(this, SWT.BORDER);
		p2Name.setBounds(350, 101, 273, 21);
		
		Label lblPlayerName_1 = new Label(this, SWT.NONE);
		lblPlayerName_1.setBounds(259, 147, 85, 15);
		lblPlayerName_1.setText("Player 3 Name:");
		
		p3Name = new Text(this, SWT.BORDER);
		p3Name.setBounds(350, 144, 273, 21);
		
		Label lblPlayerName_2 = new Label(this, SWT.NONE);
		lblPlayerName_2.setBounds(259, 197, 85, 15);
		lblPlayerName_2.setText("Player 4 Name:");
		
		p4Name = new Text(this, SWT.BORDER);
		p4Name.setBounds(350, 194, 273, 21);
		
		List list = new List(this, SWT.BORDER);
		list.setBounds(81, 70, 55, 49);
		list.setItems(new String[] {"2 Player", "3 Player", "4 Player"});
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setBounds(350, 308, 273, 132);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("BUTTON PRESSED");
				playerCount = list.getSelectionIndex() + 2;
				data.setCount(playerCount);
				data.addName(getP1Name());
				data.addName(getP2Name());
				data.addName(getP3Name());
				data.addName(getP4Name());
				
				System.out.println("Player Count: " + playerCount);
				System.out.println("Player 1 Name: " + getP1Name());
				
				//playerCount = playerCount;
//				wait = false;
//				System.out.println(playerCount);
				parent.dispose();
				
			}
		});
		btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 22, SWT.NORMAL));
		btnNewButton.setText("BEGIN");
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setBounds(81, 47, 55, 15);
		lblNewLabel.setText("Mode");
		

	}
	
	public String getP1Name() {
		return p1Name.getText();
	}
	
	public String getP2Name() {
		return p2Name.getText();
	}
	
	public String getP3Name() {
		return p3Name.getText();
	}
	
	public String getP4Name() {
		return p4Name.getText();
	}
	
	public int getPlayerCount() {
		return playerCount;
	}
	/*
	public boolean getWait() {
		return wait;
	}*/

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
