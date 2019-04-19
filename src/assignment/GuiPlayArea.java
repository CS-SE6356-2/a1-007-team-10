package assignment;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class GuiPlayArea extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GuiPlayArea(Composite parent, int style) {
		super(parent, SWT.BORDER);
		
		Label title = new Label(this, SWT.NONE);
		title.setBounds(10, 10, 55, 15);
		title.setText("Crazy 8s");
		
		Composite handArea = new Composite(this, SWT.BORDER);
		handArea.setBackground(SWTResourceManager.getColor(204, 255, 255));
		handArea.setBounds(10, 335, 936, 191);
		
		Label lblHand = new Label(handArea, SWT.BORDER);
		lblHand.setBounds(250, 0, 55, 15);
		lblHand.setText("Hand");
		
		Label card1 = new Label(handArea, SWT.BORDER);
		card1.setImage(SWTResourceManager.getImage(GuiPlayArea.class, "/testImages/tempCard.png"));
		card1.setBounds(31, 29, 75, 90);
		
		Label card2 = new Label(handArea, SWT.BORDER);
		card2.setImage(SWTResourceManager.getImage(GuiPlayArea.class, "/testImages/tempCard.png"));
		card2.setBounds(134, 28, 75, 90);
		
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
		choose5.setText("Choose");
		choose5.setBounds(450, 124, 75, 25);
		
		Label card3 = new Label(handArea, SWT.BORDER);
		card3.setImage(SWTResourceManager.getImage(GuiPlayArea.class, "/testImages/tempCard.png"));
		card3.setBounds(238, 29, 75, 90);
		
		Label card4 = new Label(handArea, SWT.BORDER);
		card4.setImage(SWTResourceManager.getImage(GuiPlayArea.class, "/testImages/tempCard.png"));
		card4.setBounds(345, 29, 75, 90);
		
		Label card5 = new Label(handArea, SWT.BORDER);
		card5.setImage(SWTResourceManager.getImage(GuiPlayArea.class, "/testImages/tempCard.png"));
		card5.setBounds(450, 29, 75, 90);
		
		Composite playArea = new Composite(this, SWT.NONE);
		playArea.setBackground(SWTResourceManager.getColor(107, 142, 35));
		playArea.setBounds(10, 96, 936, 233);
		
		Label lblDeck = new Label(playArea, SWT.NONE);
		lblDeck.setLocation(387, 30);
		lblDeck.setSize(55, 15);
		lblDeck.setText("Deck");
		
		Label lblDiscardPile = new Label(playArea, SWT.NONE);
		lblDiscardPile.setLocation(493, 27);
		lblDiscardPile.setSize(76, 15);
		lblDiscardPile.setText("Discard Pile");
		
		Label discardCount = new Label(playArea, SWT.NONE);
		discardCount.setLocation(494, 10);
		discardCount.setSize(55, 15);
		discardCount.setText("6 Cards");
		
		Label deckCount = new Label(playArea, SWT.NONE);
		deckCount.setLocation(387, 11);
		deckCount.setSize(55, 15);
		deckCount.setText("32 Cards");
		
		Button btnDraw = new Button(playArea, SWT.NONE);
		btnDraw.setBounds(387, 158, 75, 25);
		btnDraw.setText("Draw");
		
		Label deckImage = new Label(playArea, SWT.BORDER);
		deckImage.setImage(SWTResourceManager.getImage(GuiPlayArea.class, "/testImages/tempCard.png"));
		deckImage.setBounds(387, 63, 75, 90);
		
		Label discardImage = new Label(playArea, SWT.BORDER);
		discardImage.setImage(SWTResourceManager.getImage(GuiPlayArea.class, "/testImages/tempCard.png"));
		discardImage.setBounds(493, 63, 75, 90);
		
		Composite scoreArea = new Composite(this, SWT.NONE);
		scoreArea.setBackground(SWTResourceManager.getColor(102, 205, 170));
		scoreArea.setBounds(298, 10, 430, 80);
		
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
