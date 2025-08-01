package blackjack;
import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> cards;
	private String person;
	private Deck deck;

	public Hand(String person, Deck deck) {
		this.person = person;
		this.deck = deck;
		this.cards = new ArrayList<>();
	}

	public void addCard() {
		cards.add(deck.pickCard());
	}

	public int getValue() {
		int value = 0;
		int aceCount = 0;

		for (Card card : cards) {
			value += card.getValue();
			if (card.isAce()) {
				aceCount++;
			}
		}

		while (value > 21 && aceCount > 0) {
			value -= 10;
			aceCount--;
		}

		return value;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void showHand() {
		System.out.print(person + " hand: ");
		for (Card card : cards) {
			System.out.print("[" + card + "] ");
		}
		System.out.println(" - Total Value: " + getValue());
	}
}
