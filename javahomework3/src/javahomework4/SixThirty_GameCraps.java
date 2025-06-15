package javahomework4;

public class SixThirty_GameCraps {
		
		public static int rollDice() {
		    int die1 = (int)(Math.random() * 6) + 1;
		    int die2 = (int)(Math.random() * 6) + 1;
		    int sum = die1 + die2;
		    System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
		    return sum;
		}

		public static void playGame() {
		    int sum = rollDice();

		    if (sum == 2 || sum == 3 || sum == 12) {
		        System.out.println("You lose");
		    } else if (sum == 7 || sum == 11) {
		        System.out.println("You win");
		    } else {
		        int point = sum;
		        System.out.println("Point is " + point);

		        while (true) {
		            sum = rollDice();
		            if (sum == 7) {
		                System.out.println("You lose");
		                break;
		            } else if (sum == point) {
		                System.out.println("You win");
		                break;
		            }
		        }
		    }
		}

		public static void main(String[] args) {
		    playGame();
		}

	}


