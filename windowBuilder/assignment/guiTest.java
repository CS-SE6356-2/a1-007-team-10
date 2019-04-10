package assignment;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Table;

public class guiTest extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public guiTest(Composite parent, int style) {
		super(parent, SWT.BORDER);
		
		Label title = new Label(this, SWT.NONE);
		title.setBounds(10, 10, 55, 15);
		title.setText("Crazy 8s");
		
		Composite handArea = new Composite(this, SWT.BORDER);
		handArea.setBackground(SWTResourceManager.getColor(204, 255, 255));
		handArea.setBounds(36, 295, 570, 155);
		
		Label lblHand = new Label(handArea, SWT.BORDER);
		lblHand.setBounds(250, 0, 55, 15);
		lblHand.setText("Hand");
		
		Label card1 = new Label(handArea, SWT.BORDER);
		card1.setBounds(31, 29, 75, 89);
		card1.setText("Card");
		
		Label card2 = new Label(handArea, SWT.BORDER);
		card2.setText("Card");
		card2.setBounds(134, 29, 75, 89);
		
		Label card3 = new Label(handArea, SWT.BORDER);
		card3.setText("Card");
		card3.setBounds(238, 29, 75, 89);
		
		Label card4 = new Label(handArea, SWT.BORDER);
		card4.setText("Card");
		card4.setBounds(345, 29, 75, 89);
		
		Label cardCountActive = new Label(handArea, SWT.NONE);
		cardCountActive.setBounds(31, 0, 55, 15);
		cardCountActive.setText("4 Cards");
		
		Button choose1 = new Button(handArea, SWT.NONE);
		choose1.setBounds(31, 124, 75, 25);
		choose1.setText("Choose");
		
		Button choose2 = new Button(handArea, SWT.NONE);
		choose2.setText("Choose");
		choose2.setBounds(134, 124, 75, 25);
		
		Button choose3 = new Button(handArea, SWT.NONE);
		choose3.setText("Choose");
		choose3.setBounds(238, 124, 75, 25);
		
		Button choose4 = new Button(handArea, SWT.NONE);
		choose4.setText("Choose");
		choose4.setBounds(345, 124, 75, 25);
		
		Button choose5 = new Button(handArea, SWT.NONE);
		choose5.setGrayed(true);
		choose5.setText("Choose");
		choose5.setBounds(460, 124, 75, 25);
		
		Composite playArea = new Composite(this, SWT.NONE);
		playArea.setBackground(SWTResourceManager.getColor(107, 142, 35));
		playArea.setBounds(36, 96, 570, 193);
		
		Label lblDeck = new Label(playArea, SWT.NONE);
		lblDeck.setLocation(194, 30);
		lblDeck.setSize(55, 15);
		lblDeck.setText("Deck");
		
		Label lblDiscardPile = new Label(playArea, SWT.NONE);
		lblDiscardPile.setLocation(300, 27);
		lblDiscardPile.setSize(76, 15);
		lblDiscardPile.setText("Discard Pile");
		
		Label discardCount = new Label(playArea, SWT.NONE);
		discardCount.setLocation(301, 10);
		discardCount.setSize(55, 15);
		discardCount.setText("6 Cards");
		
		Label deckCount = new Label(playArea, SWT.NONE);
		deckCount.setLocation(194, 11);
		deckCount.setSize(55, 15);
		deckCount.setText("32 Cards");
		
		Button btnDraw = new Button(playArea, SWT.NONE);
		btnDraw.setBounds(194, 158, 75, 25);
		btnDraw.setText("Draw");
		
		Label discard = new Label(playArea, SWT.BORDER);
		discard.setText("Card");
		discard.setBounds(301, 57, 75, 89);
		
		Label deck = new Label(playArea, SWT.BORDER);
		deck.setText("Card");
		deck.setBounds(194, 57, 75, 89);
		
		Composite scoreArea = new Composite(this, SWT.NONE);
		scoreArea.setBackground(SWTResourceManager.getColor(102, 205, 170));
		scoreArea.setBounds(71, 10, 535, 80);
		
		Label lblPlayer1 = new Label(scoreArea, SWT.BORDER);
		lblPlayer1.setBounds(10, 10, 55, 15);
		lblPlayer1.setText("Player 1");
		
		Label lblPlayer2 = new Label(scoreArea, SWT.BORDER);
		lblPlayer2.setText("Player 2");
		lblPlayer2.setBounds(110, 10, 55, 15);
		
		Label lblPlayer3 = new Label(scoreArea, SWT.BORDER);
		lblPlayer3.setText("Player 3");
		lblPlayer3.setBounds(218, 10, 55, 15);
		
		Label lblPlayer4 = new Label(scoreArea, SWT.BORDER);
		lblPlayer4.setText("Player 4");
		lblPlayer4.setBounds(333, 10, 55, 15);
		
		Label score1 = new Label(scoreArea, SWT.BORDER);
		score1.setText("4 cards");
		score1.setBounds(10, 45, 55, 15);
		
		Label score2 = new Label(scoreArea, SWT.BORDER);
		score2.setText("2 cards");
		score2.setBounds(110, 45, 55, 15);
		
		Label score3 = new Label(scoreArea, SWT.BORDER);
		score3.setText("6 cards");
		score3.setBounds(218, 45, 55, 15);
		
		Label score4 = new Label(scoreArea, SWT.BORDER);
		score4.setText("3 cards");
		score4.setBounds(333, 45, 55, 15);
		
		Label turnDisplay = new Label(this, SWT.WRAP);
		turnDisplay.setBounds(10, 55, 55, 35);
		turnDisplay.setText("Player 1's Turn");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
