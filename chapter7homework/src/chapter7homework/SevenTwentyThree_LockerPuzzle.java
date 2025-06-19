package chapter7homework;

public class SevenTwentyThree_LockerPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        boolean[] lockers = new boolean[100];

        for (int student = 1; student <= 100; student++) {
            // Student toggles lockers that are multiples of their number
            for (int locker = student - 1; locker < 100; locker += student) {
                lockers[locker] = !lockers[locker]; // toggle
            }
        }
        
        System.out.println("Open lockers:");
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print((i + 1) + " ");
            }
        }

	}

}
