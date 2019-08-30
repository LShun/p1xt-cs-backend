import java.util.Scanner;

public class PracticeC5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double x = in.nextDouble();
        double y = Math.log(x);
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + "is not a number");
            return;
        }
        if (x >= 0) {
            System.out.println("The log is " + y);
        } else {
            System.out.println("The log is undefined");
        }

    }
}
