import java.util.Scanner;

public class C3Practice {
    public static void main(String args[]) {
        final double CM_PER_INCH = 2.54;
        double cm;
        Scanner in = new Scanner(System.in);

        System.out.print("How many inches? ");
        int inch = in.nextInt();

        cm = inch * CM_PER_INCH;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");

        System.out.printf("Four thirds = %.3f", 4.0 / 3.0);

        inch = 100;
        cm = inch * CM_PER_INCH;
        System.out.printf("%d in = %f cm\n", inch, cm);

        double pi = 3.14159;
        int x = (int) pi;

        double y = (int) pi * 20.0; // result is 60.0, not 62.0;

        inch = (int) (cm / CM_PER_INCH);
        System.out.printf("%f cm %d in\n", cm, inch);

    }
}


