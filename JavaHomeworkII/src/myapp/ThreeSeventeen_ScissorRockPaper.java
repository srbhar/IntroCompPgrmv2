package myapp;

import java.util.Scanner;

public class ThreeSeventeen_ScissorRockPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

        int computerchoice = (int)(Math.random() * 3);

        String compplay;
        if (computerchoice == 0) {
            compplay = "scissor";
        } else if (computerchoice == 1) {
            compplay = "rock";
        } else {
            compplay = "paper";
        }

        System.out.print("scissor (0), rock (1), paper (2): ");
        int userinput = input.nextInt();

        String userplay;
        if (userinput == 0) {
            userplay = "scissor";
        } else if (userinput == 1) {
            userplay = "rock";
        } else {
            userplay = "paper";
        }

        if (userinput == computerchoice) {
            System.out.println("The computer is " + compplay + ". You are " + userplay + " too. It is a draw.");
        } else if (
            (userinput == 0 && computerchoice == 2) ||  // scissor beats paper
            (userinput == 1 && computerchoice == 0) ||  // rock beats scissor
            (userinput == 2 && computerchoice == 1)     // paper beats rock
        ) {
            System.out.println("The computer is " + compplay + ". You are " + userplay + ". You win!");
        } else {
            System.out.println("The computer is " + compplay + ". You are " + userplay + ". You lose.");
        }

        input.close();
		
	}

}
