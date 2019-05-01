package cardGui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class GuiGameEnd extends GuiObject {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GuiGameEnd(Composite parent, int style, GameData data) {
		super(parent, style);
		
		Label label = new Label(this, SWT.NONE);
		label.setText("Crazy 8s");
		label.setBounds(10, 10, 55, 15);
		
		Label lblNewLabel = new Label(this, SWT.WRAP);
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		lblNewLabel.setBounds(375, 225, 201, 77);
		lblNewLabel.setText(data.getTurnName() + " Wins!");
		
		Button btnExit = new Button(this, SWT.NONE);
		btnExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setContinue(false);
				parent.dispose();
			}
		});
		btnExit.setBounds(439, 422, 75, 25);
		btnExit.setText("Exit");
		
		Button btnNewGame = new Button(this, SWT.NONE);
		btnNewGame.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setContinue(true);
				parent.dispose();
			}
		});
		btnNewGame.setBounds(439, 372, 75, 25);
		btnNewGame.setText("New Game");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
