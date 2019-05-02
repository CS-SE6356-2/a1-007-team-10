package cardGui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
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
		
		/*//This is how to not open a new window every time but I'm not going to mess with this until everything else works
		Composite holder = new Composite(shell, SWT.NONE);
		holder.setSize(960, 540);
		holder.setLayout(new FillLayout(SWT.HORIZONTAL));
		*/
		GuiObject content = null;
		switch(state) {
		case 0: content = new GuiGameStart(shell, SWT.NONE, d);
			break;
		case 1: content = new GuiTurnStart(shell, SWT.NONE, d);
			break;
		case 2: content = new GuiPlayArea(shell, SWT.NONE, d);
			break;
		case 3: content = new GuiGameEnd(shell, SWT.NONE, d);
			break;
		case 4: content = new GuiMessage(shell, SWT.NONE, d);
			break;
		case 5: content = new GuiDeclareSuit(shell, SWT.NONE, d);
			break;
		default: System.out.println("Unknown state passed to application window");
		}
		
	}

	public void setState(int s) {
		state = s;
		
		return;
	}
	

}
