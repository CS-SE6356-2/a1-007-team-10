package cardGui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class GuiDeclareSuit extends GuiObject {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GuiDeclareSuit(Composite parent, int style, GameData data) {
		super(parent, style);
		
		Label lblCrazys = new Label(this, SWT.NONE);
		lblCrazys.setBounds(10, 10, 55, 15);
		lblCrazys.setText("Crazy 8s");
		
		Label clubs0 = new Label(this, SWT.BORDER);
		clubs0.setImage(SWTResourceManager.getImage(GuiDeclareSuit.class, "/images/7_0.png"));
		clubs0.setBounds(291, 179, 75, 90);
		
		Button choose0 = new Button(this, SWT.NONE); //clubs
		choose0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(0);
				parent.dispose();
			}
		});
		choose0.setBounds(291, 275, 75, 25);
		choose0.setText("choose");
		
		Label label = new Label(this, SWT.BORDER);
		label.setImage(SWTResourceManager.getImage(GuiDeclareSuit.class, "/images/7_1.png"));
		label.setBounds(372, 179, 75, 90);
		
		Button choose1 = new Button(this, SWT.NONE); //diamonds
		choose1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(1);
				parent.dispose();
			}
		});
		choose1.setText("choose");
		choose1.setBounds(372, 275, 75, 25);
		
		Label label_1 = new Label(this, SWT.BORDER);
		label_1.setImage(SWTResourceManager.getImage(GuiDeclareSuit.class, "/images/7_2.png"));
		label_1.setBounds(453, 179, 75, 90);
		
		Button choose2 = new Button(this, SWT.NONE); //hearts
		choose2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(2);
				parent.dispose();
			}
		});
		choose2.setText("choose");
		choose2.setBounds(453, 275, 75, 25);
		
		Label label_2 = new Label(this, SWT.BORDER);
		label_2.setImage(SWTResourceManager.getImage(GuiDeclareSuit.class, "/images/7_3.png"));
		label_2.setBounds(534, 179, 75, 90);
		
		Button choose3 = new Button(this, SWT.NONE); //spades
		choose3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(3);
				parent.dispose();
			}
		});
		choose3.setText("choose");
		choose3.setBounds(534, 275, 75, 25);
		
		Label lblChooseTheSuit = new Label(this, SWT.NONE);
		lblChooseTheSuit.setBounds(382, 158, 142, 15);
		lblChooseTheSuit.setText("Choose the suit for your 8");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
