package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

import BlackJackBase.PCard;
import BlackJackBase.PDeck;

/*
 * A calss 
 * It has a hidden attribute to be face up or face down.
 * Each card has its own character and unicode icon for the suit. 
 * If it is a named card, It has its letter associated with it.
 * 
 * @author CJ Knowles
 * @version 1.0
 * @since 3/6/2024
 */

public class BJDeck implements PDeck {
	private ArrayList<BJCard> cards;
	
	public BJDeck()
	{
		cards = new ArrayList<BJCard>();
		
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= 14; j++)
			{
				cards.add(new BJCard(j,i));
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public void addCard(PCard card) {
		cards.add((BJCard)card);
	}

	public PCard dealCard() {
		if (cards.size() != 0)
		{
			PCard c = cards.get(cards.size() - 1);
			cards.remove(cards.size() - 1);
			return c;
		}
		return null;
	}

	public PCard dealHiddenCard() {
		if (cards.size() != 0)
		{
			PCard c = cards.get(cards.size() - 1);
			cards.remove(cards.size() - 1);
			c.hideCard();
			return c;
		}
		return null;
	}

	public int cardCount() {
		return cards.size();
	}

	
}
