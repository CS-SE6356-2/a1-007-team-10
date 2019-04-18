package assignment;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

public class GuiTurnStart extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GuiTurnStart(Composite parent, int style) {
		super(parent, style);
		setLayout(null);
		
		Label lblPlayerTurn = new Label(this, SWT.WRAP);
		lblPlayerTurn.setBounds(374, 172, 171, 36);
		lblPlayerTurn.setText("Player 1's Turn");
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setBounds(414, 293, 75, 25);
		btnNewButton.setText("Begin");
		
		Label label = new Label(this, SWT.NONE);
		label.setText("Crazy 8s");
		label.setBounds(10, 10, 55, 15);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
