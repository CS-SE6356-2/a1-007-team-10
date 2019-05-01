package cardGui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class GuiPlayArea extends GuiObject {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GuiPlayArea(Composite parent, int style, GameData data) {
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
		
		Label card0 = new Label(handArea, SWT.NONE);
		card0.setImage(getCardImage(data,0));
		card0.setBounds(10, 28, 75, 90);
		
		Label card1 = new Label(handArea, SWT.NONE);
		card1.setImage(getCardImage(data,1));
		card1.setBounds(91, 28, 75, 90);
		
		Label cardCountActive = new Label(handArea, SWT.NONE);
		cardCountActive.setBounds(31, 0, 55, 15);
		cardCountActive.setText(data.getHand().size() + " Cards");
		
		Button choose0 = new Button(handArea, SWT.NONE);
		choose0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(0);
				parent.dispose();
			}
		});
		choose0.setBounds(10, 123, 75, 25);
		choose0.setText("Choose");
		
		Button choose1 = new Button(handArea, SWT.NONE);
		choose1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(1);
				parent.dispose();
			}
		});
		choose1.setText("Choose");
		choose1.setBounds(91, 124, 75, 25);
		
		Button choose2 = new Button(handArea, SWT.NONE);
		choose2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(2);
				parent.dispose();
			}
		});
		choose2.setText("Choose");
		choose2.setBounds(172, 123, 75, 25);
		
		Button choose3 = new Button(handArea, SWT.NONE);
		choose3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(3);
				parent.dispose();
			}
		});
		choose3.setText("Choose");
		choose3.setBounds(250, 123, 75, 25);
		
		Button choose4 = new Button(handArea, SWT.NONE);
		choose4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(4);
				parent.dispose();
			}
		});
		choose4.setText("Choose");
		choose4.setBounds(331, 123, 75, 25);
		
		Label card2 = new Label(handArea, SWT.NONE);
		card2.setImage(getCardImage(data,2));
		card2.setBounds(172, 28, 75, 90);
		
		Label card3 = new Label(handArea, SWT.NONE);
		card3.setImage(getCardImage(data,3));
		card3.setBounds(250, 28, 75, 90);
		
		Label card4 = new Label(handArea, SWT.NONE);
		card4.setImage(getCardImage(data,4));
		card4.setBounds(331, 28, 75, 90);
		
		Label card5 = new Label(handArea, SWT.NONE);
		card5.setImage(getCardImage(data,5));
		card5.setBounds(412, 28, 75, 90);
		
		Button choose5 = new Button(handArea, SWT.NONE);
		choose5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(5);
				parent.dispose();
			}
		});
		choose5.setText("Choose");
		choose5.setBounds(412, 123, 75, 25);
		
		Label card6 = new Label(handArea, SWT.NONE);
		card6.setImage(getCardImage(data,6));
		card6.setBounds(493, 28, 75, 90);
		
		Button choose6 = new Button(handArea, SWT.NONE);
		choose6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(6);
				parent.dispose();
			}
		});
		choose6.setText("Choose");
		choose6.setBounds(493, 123, 75, 25);
		
		Label card7 = new Label(handArea, SWT.NONE);
		card7.setImage(getCardImage(data,7));
		card7.setBounds(574, 28, 75, 90);
		
		Button choose7 = new Button(handArea, SWT.NONE);
		choose7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(7);
				parent.dispose();
			}
		});
		choose7.setText("Choose");
		choose7.setBounds(574, 123, 75, 25);
		
		Label card8 = new Label(handArea, SWT.NONE);
		card8.setImage(getCardImage(data,8));
		card8.setBounds(655, 28, 75, 90);
		
		Button choose8 = new Button(handArea, SWT.NONE);
		choose8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(8);
				parent.dispose();
			}
		});
		choose8.setText("Choose");
		choose8.setBounds(655, 123, 75, 25);
		
		Label card9 = new Label(handArea, SWT.NONE);
		card9.setImage(getCardImage(data,9));
		card9.setBounds(736, 28, 75, 90);
		
		Button choose9 = new Button(handArea, SWT.NONE);
		choose9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(9);
				parent.dispose();
			}
		});
		choose9.setText("Choose");
		choose9.setBounds(736, 123, 75, 25);
		
		Label card10 = new Label(handArea, SWT.NONE);
		card10.setImage(getCardImage(data,10));
		card10.setBounds(817, 28, 75, 90);
		
		Button choose10 = new Button(handArea, SWT.NONE);
		choose10.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(10);
				parent.dispose();
			}
		});
		choose10.setText("Choose");
		choose10.setBounds(817, 123, 75, 25);
		
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
		discardCount.setText(data.getDiscardSize() + " Cards");
		
		Label deckCount = new Label(playArea, SWT.NONE);
		deckCount.setLocation(387, 11);
		deckCount.setSize(55, 15);
		deckCount.setText(data.getDeckSize() + " Cards");
		
		Button btnDraw = new Button(playArea, SWT.NONE);
		btnDraw.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				data.setChoice(-1);
				parent.dispose();
			}
		});
		btnDraw.setBounds(387, 158, 75, 25);
		btnDraw.setText("Draw");
		
		Label deckImage = new Label(playArea, SWT.NONE);
		deckImage.setImage(SWTResourceManager.getImage(GuiPlayArea.class, "/images/cardback.png"));
		deckImage.setBounds(387, 63, 75, 90);
		
		Label discardImage = new Label(playArea, SWT.NONE);
		discardImage.setImage(data.getTopCard().getImage());
		discardImage.setBounds(493, 63, 75, 90);
		/*
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
		*/
		Label turnDisplay = new Label(this, SWT.WRAP);
		turnDisplay.setBounds(10, 55, 55, 35);
		turnDisplay.setText(data.getTurnName() + "'s Turn");

	}
	
	private static Image getCardImage(GameData d, int index) { //gets the image for a card from the GameData object based on Hand index, checks for oob and if true, returns a blank image instead
		if(index > d.getHand().size()) {
			return SWTResourceManager.getImage(GuiPlayArea.class, "/images/blank.png");
		}
		else
		{
			return d.getHand().get(index).getImage();
		}
		
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
