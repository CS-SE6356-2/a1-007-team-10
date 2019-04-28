package cardGui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.List;

public class GuiGameStart extends Composite {
	private Text p1Name;
	private Text p2Name;
	private Text p3Name;
	private Text p4Name;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GuiGameStart(Composite parent, int style) {
		super(parent, style);
		
		Label label = new Label(this, SWT.NONE);
		label.setText("Crazy 8s");
		label.setBounds(10, 10, 55, 15);
		
		Label lblPlayer = new Label(this, SWT.NONE);
		lblPlayer.setBounds(259, 62, 85, 15);
		lblPlayer.setText("Player 1 Name:");
		
		p1Name = new Text(this, SWT.BORDER);
		p1Name.setBounds(350, 59, 273, 21);
		
		Label lblPlayerName = new Label(this, SWT.NONE);
		lblPlayerName.setText("Player 2 Name:");
		lblPlayerName.setBounds(259, 104, 85, 15);
		
		p2Name = new Text(this, SWT.BORDER);
		p2Name.setBounds(350, 101, 273, 21);
		
		Label lblPlayerName_1 = new Label(this, SWT.NONE);
		lblPlayerName_1.setText("Player 3 Name:");
		lblPlayerName_1.setBounds(259, 147, 85, 15);
		
		p3Name = new Text(this, SWT.BORDER);
		p3Name.setBounds(350, 144, 273, 21);
		
		Label lblPlayerName_2 = new Label(this, SWT.NONE);
		lblPlayerName_2.setText("Player 4 Name:");
		lblPlayerName_2.setBounds(259, 197, 85, 15);
		
		p4Name = new Text(this, SWT.BORDER);
		p4Name.setBounds(350, 194, 273, 21);
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 22, SWT.NORMAL));
		btnNewButton.setBounds(350, 308, 273, 132);
		btnNewButton.setText("BEGIN");
		
		List list = new List(this, SWT.BORDER);
		list.setItems(new String[] {"2 Player", "3 Player", "4 Player"});
		list.setBounds(81, 70, 55, 49);
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setBounds(81, 47, 55, 15);
		lblNewLabel.setText("Mode");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
