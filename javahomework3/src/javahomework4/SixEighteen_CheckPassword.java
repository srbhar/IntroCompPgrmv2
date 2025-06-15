package javahomework4;

import java.util.Scanner;

public class SixEighteen_CheckPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter a password: ");
		        String password = input.nextLine();

		        boolean isValid = isValidPassword(password);

		        if (isValid == false) {
		            System.out.println("Invalid password");
		        } else {
		            System.out.println("Valid password");
		        }
		        
		        input.close();
		    }

		    public static boolean isValidPassword(String password) {
		        if (password.length() < 8) {
		            return false;
		        } else {
		            int lettercount = 0;
		            int digitcount = 0;

		            for (int i = 0; i < password.length(); i++) {
		                char ch = password.charAt(i);

		                if (Character.isLetter(ch)) {
		                    lettercount++;
		                } else if (Character.isDigit(ch)) {
		                    digitcount++;
		                } else {
		                    return false;
		                }
		            }

		            if (digitcount < 2) {
		                return false;
		           } else {
		                return true;
		            }
		        }
		    }
		}