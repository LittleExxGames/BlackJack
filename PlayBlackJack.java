package BlackJack;



/*
 * Main location to start a game of Black jack.
 * 
 * @author CJ Knowles
 * @version 0.2
 * @since 2024-06-3
 */
import BlackJackTest.DeckTest;

public class PlayBlackJack {

	
	public static void main(String[] args) {
		DeckTest.run(new BJDeck());
	}

}
