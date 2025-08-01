package blackjack;
import java.util.*;
public class Game {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
	private Deck deck;
	private Hand playerHand;
	private Hand dealerHand;
	private int wins = 0;
	private int losses = 0;
	private int pushes = 0;
	private Scanner input;

	public Game() {
		deck = new Deck();
		input = new Scanner(System.in);
		System.out.println("Welcome to BlackJack.");

		while (true) {
			if (!startRound()) {
				continue;
			}
			playPlayerTurn();
			if (playerHand.getValue() <= 21) {
				playDealerTurn();
			}
			determineOutcome();
			printScoreboard();
			promptEnter(GREEN + "\nNext round!\n" + RESET);
		}
	}

	private boolean startRound() {
		playerHand = new Hand("Your", deck);
		dealerHand = new Hand("Dealer", deck);

		playerHand.addCard();
		playerHand.addCard();
		dealerHand.addCard();
		dealerHand.addCard();

		System.out.println("The dealer's hand looks like this:");
		System.out.println("[" + dealerHand.getCards().get(0) + "]\n[Second card face down]");
		playerHand.showHand();

		int playerVal = playerHand.getValue();
		int dealerVal = dealerHand.getValue();

		if (playerVal == 21 && dealerVal != 21) {
			System.out.println("You have BlackJack! You win!");
			playerHand.showHand();
			dealerHand.showHand();
			wins++;
			printScoreboard();
			promptEnter(GREEN + "\nNext round!\n" + RESET);
			return false;
		} else if (dealerVal == 21 && playerVal != 21) {
			System.out.println(RED + "Dealer has BlackJack. You lose." + RESET);
			playerHand.showHand();
			dealerHand.showHand();
			losses++;
			printScoreboard();
			promptEnter(GREEN + "\nNext round!\n" + RESET);
			return false;
		} else if (dealerVal == 21 && playerVal == 21) {
			System.out.println(GREEN + "Push!" + RESET + " You and the dealer have BlackJack.");
			playerHand.showHand();
			dealerHand.showHand();
			pushes++;
			printScoreboard();
			promptEnter(GREEN + "\nNext round!\n" + RESET);
			return false;
		} return true;
	}

	private void playPlayerTurn() {
		while (true) {
			System.out.print("Would you like to: " + GREEN + "1) Hit or 2) Stand " + RESET + "or 3) Quit? ");
			int choice = input.nextInt();
			input.nextLine();
			if (choice == 1) {
				playerHand.addCard();
				playerHand.showHand();
				if (playerHand.getValue() > 21) {
					System.out.println(RED + "You busted!" + RESET);
					break;
				}
			} else if (choice == 2) {
				System.out.println(GREEN + "You stand." + RESET);
				break;
			} else if (choice == 3) {
				System.out.println(GREEN + "Thanks for playing!" + RESET);
				System.exit(0);
			}
			else {
				System.out.println(RED + "Choose 1 or 2, buddy." + RESET);
			}
		}
	}

	private void playDealerTurn() {
		promptEnter("Dealer reveals hand:");
		dealerHand.showHand();

		while (dealerHand.getValue() < 17) {
			promptEnter("Dealer draws a card.");
			dealerHand.addCard();
			dealerHand.showHand();
		}

		if (dealerHand.getValue() > 21) {
			System.out.println(GREEN + "Dealer busts!" + RESET);
		} else {
			promptEnter("Dealer stands.");
		}
	}

	private void determineOutcome() {
		int playerVal = playerHand.getValue();
		int dealerVal = dealerHand.getValue();

		if (playerVal > 21) {
			promptEnter(RED + "You lose." + RESET);
			losses++;
		} else if (dealerVal > 21) {
			promptEnter(GREEN + "You win!" + RESET);
			wins++;
		} else if (playerVal > dealerVal) {
			promptEnter(GREEN + "You win!" + RESET);
			wins++;
		} else if (playerVal < dealerVal) {
			promptEnter(RED + "You lose." + RESET);
			losses++;
		} else {
			promptEnter(GREEN + "It's a push." + RESET);
			pushes++;
		}
	}
	
	private void promptEnter(String message) {  // just to build some suspense :)
		System.out.print(message + GREEN + " (Enter to continue)" + RESET);
		input.nextLine();
	}

	private void printScoreboard() {
		System.out.println("Wins: " + wins + GREEN + " | " + RESET + "Losses: " + losses + GREEN + " | " + RESET + "Pushes: " + pushes);
	}
}