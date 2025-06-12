package javahomework3;

import java.util.Scanner;

public class FiveThirtyTwo_GameLottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner input = new Scanner(System.in);

		        // digit 1
		        int lotteryDigit1 = (int) (Math.random() * 10);

		        // different digit 2
		        int lotteryDigit2;
		        do {
		            lotteryDigit2 = (int) (Math.random() * 10);
		        } while (lotteryDigit2 == lotteryDigit1);

		        // combine digits 
		        int lottery = lotteryDigit1 * 10 + lotteryDigit2;

		        System.out.print("Enter your lottery pick (two digits): ");
		        int guess = input.nextInt();

		        // get guess digits
		        int guessDigit1 = guess / 10;
		        int guessDigit2 = guess % 10;

		        System.out.println("The lottery number is " + lottery);

		        // check the guess
		        if (guess == lottery)
		            System.out.println("Exact match: you win $10,000");
		        else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)
		            System.out.println("Match all digits: you win $3,000");
		        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
		                 guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
		            System.out.println("Match one digit: you win $1,000");
		        else
		            System.out.println("Sorry, no match");

		        input.close();

	}

}
