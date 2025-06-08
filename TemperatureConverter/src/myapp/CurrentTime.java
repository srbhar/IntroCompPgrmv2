package myapp;

import java.util.Scanner;

public class CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	long totalMilliseconds = System.currentTimeMillis();

	long totalSeconds = totalMilliseconds / 1000;

	long currentSecond = totalSeconds % 60;
 
	long totalMinutes = totalSeconds / 60;

	long currentMinute = totalMinutes % 60;

	long totalHours = totalMinutes / 60;

	long currentHour = totalHours % 24;

	Scanner input = new Scanner(System.in);
    System.out.print("Enter the time zone offset to GMT: ");
    double offset = input.nextDouble();

    int offsetHours = (int) offset;
    double decimalPart = offset - offsetHours;
    int offsetMinutes = (int) (decimalPart * 60);

    long adjustedHour = currentHour + offsetHours;
    long adjustedMinute = currentMinute + offsetMinutes;

    if (adjustedMinute >= 60) {
        adjustedHour += 1;
        adjustedMinute -= 60;
    }

    if (adjustedHour >= 24) {
        adjustedHour -= 24;
    }
    
    System.out.printf("The current time is %02d:%02d:%02d%n", adjustedHour, adjustedMinute, currentSecond);
	
	input.close();
	
	
	}
 }