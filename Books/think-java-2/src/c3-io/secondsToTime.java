/*
secondsToTime.java
Converts the time in seconds to hours, minutes and seconds (no years and months!)
 */

import java.util.Scanner;

// Integer -> String
public class secondsToTime {
    public static void main(String args[]) {
        int hr, min, secs, initSecs;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a time in seconds (no worries I won't bite): ");
        initSecs = in.nextInt();

        secs = initSecs;

        min = (int) (secs / 60.0);
        secs %= 60;

        hr = (int) (min / 60.0);
        min %= 60;

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", initSecs, hr, min, secs);


    }
}
