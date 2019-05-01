package cardGui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class GuiMessage extends GuiObject {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GuiMessage(Composite parent, int style, GameData d) {
		super(parent, style);
		setLayout(null);
		
		Label lblMessage = new Label(this, SWT.NONE);
		lblMessage.setBounds(10, 10, 55, 15);
		lblMessage.setText("Message");
		
		Label lblNewLabel = new Label(this, SWT.BORDER | SWT.WRAP);
		lblNewLabel.setBounds(10, 31, 864, 399);
		lblNewLabel.setText(d.getMessage());
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				parent.dispose();
			}
		});
		btnNewButton.setBounds(799, 436, 75, 25);
		btnNewButton.setText("Okay");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
