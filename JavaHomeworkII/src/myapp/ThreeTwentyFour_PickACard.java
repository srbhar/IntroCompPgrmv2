package myapp;

public class ThreeTwentyFour_PickACard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        int randomRank = (int)(Math.random() * 13);
        int randomSuit = (int)(Math.random() * 4);

        System.out.println("The card you picked is " + ranks[randomRank] + " of " + suits[randomSuit]);

	}

}
