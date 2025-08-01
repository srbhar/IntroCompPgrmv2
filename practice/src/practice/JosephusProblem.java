package practice;
import java.util.Scanner;
import java.util.ArrayList;
public class JosephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		System.out.print("Enter k: ");
		int k = input.nextInt();
        ArrayList<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }
        int currentIndex = 0;

        // elimination
        while (circle.size() > 1) {
            // k-1 steps ahead
            currentIndex = (currentIndex + k - 1) % circle.size();
            circle.remove(currentIndex);
        }
        System.out.println("The person who survives is at position: " + circle.get(0));
        
        input.close();
	}

}
