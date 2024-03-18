package BlackJack;



import java.awt.Color;

import BlackJackBase.PGame;
/*
 * Main location to start a game of Black jack.
 * 
 * @author CJ Knowles
 * @version 0.21
 * @since 3/15/2024
 */

public class PlayBlackJack {

	
	public static void main(String[] args) {
		PGame.setBackgroundColor(new Color(2, 115, 10));
		PGame.setBannerColor(new Color(2, 52, 105));
		PGame.setBannerTextColor(new Color(143, 204, 204));
		PGame.setStatusTextColor(new Color(240, 57, 48));
		PGame.setButtonColor(new Color(21, 60, 189));
		PGame.setButtonHighlightColor(new Color(28, 58, 156));
		PGame.setButtonTextColor(new Color(9, 38, 23));
		PGame.setFont("Tahoma");
		PGame.run(new BJDeck(), new BJHand(), new BJHand());
	}

}
