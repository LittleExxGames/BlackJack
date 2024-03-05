package BlackJack;

import java.awt.Color;

import BlackJackBase.PCard;

/*
 * Declares the identity of a card though integers. It has a hidden attribute to be face up or face down.
 * Each card has its own character and unicode icon for the suit. 
 */

public class BJCard extends PCard {
	private int rank;
	private int suit;
	private boolean hidden;
	
	public final int ACE = 1;
	public final int TWO = 2;
	public final int THREE = 3;
	public final int FOUR = 4;
	public final int FIVE = 5;
	public final int SIX = 6;
	public final int SEVEN = 7;
	public final int EIGHT = 8;
	public final int NINE = 9;
	public final int TEN = 10;
	public final int JACK = 11;
	public final int KNIGHT = 12;
	public final int QUEEN = 13;
	public final int KING = 14;
	
	
	public final int SPADE = 1;
	public final int HEART = 2;
	public final int DIAMOND = 3;
	public final int CLUB = 4;
	

	public BJCard(int newRank, int newSuit)
	{
		rank = newRank;
		suit = newSuit;
		hidden = false;
	}
	
	public int getRank()
	{
		return rank;
	}
	public void setRank(int newRank)
	{
		rank = newRank;
	}
	
	public int getSuit()
	{
		return suit;
	}
	public void setSuit(int newSuit)
	{
		suit = newSuit;
	}
	
	public void hideCard() {
		hidden = true;
	}

	public void showCard() {
		hidden = false;
	}

	public boolean isHidden() {
		return hidden;
	}

	public String getText() {
		String info = "";
		switch (rank)
		{
		case ACE:
			info = "A";
			break;
		case TWO:
			info = "2";
			break;
		case THREE:
			info = "3";
			break;
		case FOUR:
			info = "4";
			break;
		case FIVE:
			info = "5";
			break;
		case SIX:
			info = "6";
			break;
		case SEVEN:
			info = "7";
			break;
		case EIGHT:
			info = "8";
			break;
		case NINE:
			info = "9";
			break;
		case TEN:
			info = "10";
			break;
		case JACK:
			info = "J";
			break;
		case KNIGHT:
			info = "Kn";
			break;
		case QUEEN:
			info = "Q";
			break;
		case KING:
			info = "K";
			break;
		}
		switch (suit)
		{
		case SPADE:
			info += "\u2660";
			break;
		case HEART:
			info += "\u2665";
			break;
		case DIAMOND:
			info += "\u2666";
			break;
		case CLUB:
			info += "\u2663";
			break;
		}
		return info;
	}
	public Color getFontColor() {
		Color c = Color.WHITE;
		switch (suit)
		{
		case SPADE:
		case CLUB:
			c = Color.BLACK;
			break;
		case HEART:
		case DIAMOND:
			c = Color.RED;
			break;
		}
		return c;
	}
	
	public Color getBorderColor() {
		Color c = Color.LIGHT_GRAY;
		switch (rank)
		{
		case ACE:
			c = Color.BLUE;
			break;
		default:
			c = Color.CYAN;
			break;
		}
		return c;
	}

}
