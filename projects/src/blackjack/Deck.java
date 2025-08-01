package blackjack;
import java.util.Random;

public class Deck {
	
	private Card[] cards;
	private boolean[] used;
	private int totalUsed;

	public Deck() {
		cards = Card.values();
		used = new boolean[cards.length];
		totalUsed = 0;
		shuffle();
	}

	public void shuffle() {
		for (int i = 0; i < used.length; i++) {
			used[i] = false;
		}
		totalUsed = 0;
	}

	public Card pickCard() {
		if (totalUsed == cards.length) {
			System.out.println("Reshuffling deck");
			shuffle();
		}

		Random rand = new Random();
		int index = rand.nextInt(cards.length);
		while (used[index]) {
			index = rand.nextInt(cards.length);
		}
		used[index] = true;
		totalUsed++;
		return cards[index];
	}
	
}