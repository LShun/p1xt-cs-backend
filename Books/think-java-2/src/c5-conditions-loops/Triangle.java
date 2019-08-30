import java.util.Scanner;

public class Triangle {
    public static void main(String args[]) {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = in.nextInt();
        System.out.print("Enter b: ");
        b = in.nextInt();
        System.out.print("Enter c: ");
        c = in.nextInt();
        if (a <= 0 || b <= 0 || c <= 0) {
            System.err.println(" A triangle cannot have sides with a length of less than 0!");
            return;
        }
        if (trianglePossible(a, b, c)) {
            System.out.println("A triangle is possible to be made!");
        }
        else {
            System.out.print("A triangle is NOT possible to be made!");
        }
    }


    // Integer Integer Integer -> Boolean
    // return true if it is possible to form a triangle from the given length, else false
    public static boolean trianglePossible(int a, int b, int c) {
        if (a > b+c || b > a+c || c> a+b) {
            return false;
        }
        else {
            return true;
        }
    }
}
