package myapp;

import java.util.Scanner;

public class ThreeThirty_CurrentTime {
    public static void main(String[] args) {
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
        int offsetMinutes = (int) ((offset - offsetHours) * 60);

        long adjustedHour = (currentHour + offsetHours) % 24;
        long adjustedMinute = currentMinute + offsetMinutes;

        if (adjustedMinute >= 60) {
            adjustedMinute -= 60;
            adjustedHour += 1;
        } else if (adjustedMinute < 0) {
            adjustedMinute += 60;
            adjustedHour -= 1;
        }

        adjustedHour = (adjustedHour + 24) % 24;

        String period = (adjustedHour >= 12) ? "PM" : "AM";
        long displayHour = adjustedHour % 12;
        if (displayHour == 0) {
            displayHour = 12;
        }

        System.out.printf("The current time is %02d:%02d:%02d %s%n",
                displayHour, adjustedMinute, currentSecond, period);

        input.close();
    }
}
