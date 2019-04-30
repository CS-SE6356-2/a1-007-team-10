package cardGui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class GuiAppWindow {

	protected Shell shell;
	private int state = 0;

	/**
	 * Launch the application.
	 * @param args
	 */
/*	public static void main(String[] args) {
		try {
			GuiAppWindow window = new GuiAppWindow();
			//window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	/**
	 * Open the window.
	 */
	public void open(GameData d) {
		Display display = Display.getDefault();
		createContents(d);
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents(GameData d) {
		shell = new Shell();
		shell.setSize(960, 540);
		shell.setText("Crazy 8s");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		GuiObject content = null;
		switch(state) {
		case 0: content = new GuiGameStart(shell, SWT.NONE, d);
			break;
		case 1: content = new GuiTurnStart(shell, SWT.NONE);
			break;
		case 2: content = new GuiPlayArea(shell, SWT.NONE);
			break;
		case 3: content = new GuiGameEnd(shell, SWT.NONE);
			break;
		default: System.out.println("Unknown state passed to application window");
		}
		
	}
	
	
	public void setState(int s) {
		state = s;
		
		return;
	}
	

}
