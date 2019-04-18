package assignment;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

public class GuiGameStart extends Composite {

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

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
