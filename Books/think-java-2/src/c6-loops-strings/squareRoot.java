import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find its square root (to 4 s.f. accuracy):");
        double input = in.nextInt();

        double sqrt = findSqrt(input);

        System.out.println(sqrt);
    }

    // double -> double
    // calculate the square root for the number
    public static double findSqrt(double input) {
        double rg = input / 2;
        double g1 = (rg + input/rg) / 2;

        while (Math.abs(g1 - rg) > 0.0001) {
            rg = g1;
            g1 = (rg + input/rg) / 2;
        }

        return g1;
    }
}
