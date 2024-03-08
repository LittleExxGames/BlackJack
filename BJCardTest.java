package BlackJack;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

/*
 * TEsting each method in BJCard.
 * uses a base card for testing.
 * 
 * @author CJ Knowles
 * @version 1.0
 * @since 3/6/2024
 */

class BJCardTest {
	BJCard card = new BJCard(6,2);
	@Test
	void testHideCard() {
		card.hideCard();
		assertEquals(card.isHidden(), true);
	}

	@Test
	void testShowCard() {
		card.showCard();
		assertEquals(card.isHidden(), false);
	}

	@Test
	void testIsHidden() {
		card.hideCard();
		assertEquals(card.isHidden(), true);
		card.showCard();
		assertEquals(card.isHidden(), false);
	}

	@Test
	void testGetText() {
		assertEquals(card.getText(), "6\u2665");
	}

	@Test
	void testGetFontColor() {
		assertEquals(card.getFontColor(), Color.RED);
	}

	@Test
	void testGetBorderColor() {
		assertEquals(card.getBorderColor(), Color.CYAN);
	}

	@Test
	void testGetRank() {
		assertEquals(card.getRank(), 6);
	}

	@Test
	void testSetRank() {
		card.setRank(9);
		assertEquals(card.getRank(), 9);
	}

	@Test
	void testGetSuit() {
		assertEquals(card.getSuit(), 2);
	}

	@Test
	void testSetSuit() {
		card.setSuit(4);
		assertEquals(card.getSuit(), 4);
	}

}
