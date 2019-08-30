import java.util.Scanner;

public class evaluateExponentNegativeXSquared {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int x, n;

        System.out.println("Find the sum of the first n term of the infinite expansion series.");
        System.out.print("Enter x, the term inside exp(-x^2): ");
        x = in.nextInt();
        System.out.print("Enter n, to find the sum of the first n terms of x's infinite expansion: ");
        n = in.nextInt();
        System.out.println("The sum of the first n terms of the series is: " + gauss(x, n));
    }

    // int int -> double
    // takes in x, and n, to evaluate the sum of the first n terms of the exponential series
    public static double gauss(int x, int n) {
        double sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += gaussSign(i) * (double) xPowerOf2i(x, 2 * i) / (double) iFactorial(i);
        }

        return sum;
    }

    // integer -> integer
    // generates 1 if is even, else -1
    // !!!
    public static int gaussSign(int i) {
        if (i % 2 == 0) {
            return 1;
        }
        else {
            return -1;
        }
    }

    // integer integer -> integer
    // evaluates x to the power of n without using pow
    // !!!
    public static int xPowerOf2i(int x, int n) {
        if (x == 0) {
            return 0;
        }
        else {
            int sum = 1;
            for (int i = 0; i < n; i++) {
                sum *= x;
            }
            return sum;
        }
    }

    // integer -> integer
    // find i factorial
    public static int iFactorial(int i) {
        if (i < 0) {
            return -1;
        }
        else if (i == 0) {
            return 1;
        }
        else {
            return i * iFactorial((i - 1));
        }
    }
}
