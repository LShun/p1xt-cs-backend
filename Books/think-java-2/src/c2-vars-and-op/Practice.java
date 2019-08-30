public class Practice {
    public static void main(String args[]) {
        int hour = 11;
        int minute = 59;
        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minute);

        System.out.println("Fraction of the hour that has passed:");
        System.out.println(minute / 60);

        System.out.print("Percentage of the hour that has passed: ");
        System.out.println(minute * 100 / 60);
    }
}