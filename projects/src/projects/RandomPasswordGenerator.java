package projects;

import java.util.Random;
import java.util.ArrayList;

public class RandomPasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String specials = "$_.";

        int passwordLength = (int)(Math.random() * 8) + 8; // 8 to 15

        // empty list to hold password
        ArrayList<String> passwordList = new ArrayList<>();

        // character from each type
        passwordList.add("" + lower.charAt((int)(Math.random() * lower.length())));
        passwordList.add("" + upper.charAt((int)(Math.random() * upper.length())));
        passwordList.add("" + digits.charAt((int)(Math.random() * digits.length())));
        passwordList.add("" + specials.charAt((int)(Math.random() * specials.length())));

        // fill the rest
        String all = lower + upper + digits + specials;

        while (passwordList.size() < passwordLength) {
            int randomIndex = (int)(Math.random() * all.length());
            String nextChar = "" + all.charAt(randomIndex); // choose random index from new string with everything
            passwordList.add(nextChar); // add that character
        }

        // shuffle the characters in the list
        for (int i = 0; i < passwordList.size(); i++) {
            int j = (int)(Math.random() * passwordList.size());
            String temp = passwordList.get(i);
            passwordList.set(i, passwordList.get(j));
            passwordList.set(j, temp);
        }

        // print final password
        System.out.print("Password: ");
        for (int i = 0; i < passwordList.size(); i++) {
            System.out.print(passwordList.get(i));
        }

	}

}
