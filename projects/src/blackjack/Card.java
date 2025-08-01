package blackjack;

public enum Card {
	
	TWO1(2, "clubs"), TWO2(2, "diamonds"), TWO3(2, "hearts"), TWO4(2, "spades"),
	THREE1(3, "clubs"), THREE2(3, "diamonds"), THREE3(3, "hearts"), THREE4(3, "spades"), 
	FOUR1(4, "clubs"), FOUR2(4, "diamonds"), FOUR3(4, "hearts"), FOUR4(4, "spades"),
	FIVE1(5, "clubs"), FIVE2(5, "diamonds"), FIVE3(5, "hearts"), FIVE4(5, "spades"),
	SIX1(6, "clubs"), SIX2(6, "diamonds"), SIX3(6, "hearts"), SIX4(6, "spades"),
	SEVEN1(7, "clubs"), SEVEN2(7, "diamonds"), SEVEN3(7, "hearts"), SEVEN4(7, "spades"),
	EIGHT1(8, "clubs"), EIGHT2(8, "diamonds"), EIGHT3(8, "hearts"), EIGHT4(8, "spades"),
	NINE1(9, "clubs"), NINE2(9, "diamonds"), NINE3(9, "hearts"), NINE4(9, "spades"),
	TEN1(10, "clubs"), TEN2(10, "diamonds"), TEN3(10, "hearts"), TEN4(10, "spades"),
	JACK1(10, "clubs"), JACK2(10, "diamonds"), JACK3(10, "hearts"), JACK4(10, "spades"),
	QUEEN1(10, "clubs"), QUEEN2(10, "diamonds"), QUEEN3(10, "hearts"), QUEEN4(10, "spades"),
	KING1(10, "clubs"), KING2(10, "diamonds"), KING3(10, "hearts"), KING4(10, "spades"),
	ACE1(11, "clubs"), ACE2(11, "diamonds"), ACE3(11, "hearts"), ACE4(11, "spades"),
;
	private final int value;
	private final String suit;

	public int getValue() {
		return value;
	}

	public boolean isAce() {
		return value == 11;
	}
	@ Override
	public String toString() {
		String name = this.name();
		String rank = name.replaceAll("\\d", "");
		return rank + " of " + suit.substring(0, 1).toUpperCase() + suit.substring(1);
	}
	Card(int value, String suit) {
	this.value = value;
	this.suit = suit;
}}
