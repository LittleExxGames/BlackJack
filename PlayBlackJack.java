package BlackJack;

import java.util.ArrayList;

import BlackJackTest.CardTest;

public class PlayBlackJack {
	/* Spade:   1
	 * Heart:   2
	 * Diamond: 3
	 * Club:    4
	 */
	
	public static void main(String[] args) {
		ArrayList<BJCard> deck = new ArrayList<BJCard>();
		deck.add(new BJCard(1, 1));
		deck.add(new BJCard(6, 2));
		deck.add(new BJCard(11, 1));
		deck.add(new BJCard(12, 2));
		deck.add(new BJCard(13, 3));
		deck.add(new BJCard(14, 4));
		for (BJCard c : deck)
		{
			CardTest.run(c);
		}
	}

}
