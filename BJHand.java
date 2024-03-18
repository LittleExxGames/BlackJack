package BlackJack;

import java.util.ArrayList;

import BlackJackBase.PCard;
import BlackJackBase.PHand;
/*
 * Manages the players hand to get and and cards and find the total value of the hand.
 * 
 * @author CJ Knowles
 * @version 1.0
 * @since 3/15/2024
 */

public class BJHand  implements PHand{

	private ArrayList<BJCard> hand;
	public BJHand()
	{
		hand = new ArrayList<BJCard>();
	}

	public int getSize() {
		return hand.size();
	}


	public void addCard(PCard card) {
		hand.add((BJCard)card);
	}


	public PCard getCard(int index) {
		return hand.get(index);
	}


	public PCard removeCard(int index) {
		return hand.remove(index);
	}


	public int getValue() {
		int val = 0;
		int aces = 0;
		for (BJCard c : hand)
		{
			switch (c.getRank())
			{
			case 1:
				val += 11;
				aces++;
				break;
			case 2:
				val += 2;
				break;
			case 3:
				val += 3;
				break;
			case 4:
				val += 4;
				break;
			case 5:
				val += 5;
				break;
			case 6:
				val += 6;
				break;
			case 7:
				val += 7;
				break;
			case 8:
				val += 8;
				break;
			case 9:
				val += 9;
				break;
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
				val += 10;
				break;
			}
		}
		for (int i = aces; i > 0 && val > 21; i--)
		{
			val -= 10;
		}
		return val;
	}

}
