// Time - prints the time on the screen

public class Time {
    public static void main(String args[])
    {
        final int SECS_DAY = 86400;
        final int SECS_HOURS = 3600;
        final int SECS_MINUTES = 60;

        int hour = 8;
        int minute = 16;
        int second = 30;
        
        // seconds from midnight
        int secondsFromMidnight = hour * SECS_HOURS + minute * SECS_MINUTES + second;

        System.out.println("Seconds since midnight: " + secondsFromMidnight);

        // seconds from end of day
        int secondsFromEndOfDay = SECS_DAY - secondsFromMidnight;

        System.out.println("Seconds remaining in a day: " + secondsFromEndOfDay);

        //percentage of day has passed
        System.out.println("Percentage of day passed: " + ((float) secondsFromMidnight / SECS_DAY) * 100);

        // time passed since start working on this exercise
        int timeStartSeconds = hour * SECS_HOURS + minute * SECS_MINUTES + second;

        hour = 8;
        minute = 37;
        second = 30;

        int timeEndSeconds = hour * SECS_HOURS + minute * SECS_MINUTES + second;

        int secsPassed = timeEndSeconds - timeStartSeconds;

        System.out.println("Seconds elapsed since started working on exercise: " + secsPassed);
    }
}

