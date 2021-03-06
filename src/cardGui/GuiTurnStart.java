package cardGui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class GuiTurnStart extends GuiObject {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GuiTurnStart(Composite parent, int style, GameData data) {
		super(parent, style);
		setLayout(null);
		
		Label lblPlayerTurn = new Label(this, SWT.WRAP);
		lblPlayerTurn.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		lblPlayerTurn.setAlignment(SWT.CENTER);
		lblPlayerTurn.setBounds(266, 131, 397, 78);
		lblPlayerTurn.setText(data.getTurnName() + "'s Turn");
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				parent.dispose();
			}
		});
		btnNewButton.setBounds(371, 215, 187, 88);
		btnNewButton.setText("Begin");
		
		Label label = new Label(this, SWT.NONE);
		label.setText("Crazy 8s");
		label.setBounds(10, 10, 64, 25);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
