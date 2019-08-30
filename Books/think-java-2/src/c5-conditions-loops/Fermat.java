import java.util.Scanner;

public class Fermat {
    public static void main(String args[]) {

        int a, b, c, n;
        Scanner in = new Scanner(System.in);
        boolean proof;

        // receive 4 integers, a, b, c, and n
        System.out.println("Enter 4 integers ");
        System.out.println("Enter a: ");
        a = in.nextInt();
        System.out.println("Enter b: ");
        b = in.nextInt();
        System.out.println("Enter c: ");
        c = in.nextInt();
        System.out.println("Enter n: ");
        n = in.nextInt();

        // pass to fermatIsWrong function
        proof = fermatIsWrong(a, b, c, n);

        // print the output
        if (proof == true) {
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else {
            System.out.println("No, that doesn’t work.");
        }
    }

    // Integer Integer Integer Integer -> Boolean
    // return true the Fermat's theorem hold for the numbers, otherwise, return false
    public static boolean fermatIsWrong(int a, int b, int c, int n) {
        if (n > 2 && Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n)) {
            return true;
        }
        else {
            return false;
        }
    }
}



