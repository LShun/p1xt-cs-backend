import java.util.Scanner;

public class Quadratic {
    public static void main(String args[]) {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = in.nextInt();
        System.out.print("Enter b: ");
        b = in.nextInt();
        System.out.print("Enter c: ");
        c = in.nextInt();

        if (a <= 0 || (discriminant(a, b, c) < 0)) {
            System.out.println("There are no real roots!");
        }
        else if (discriminant(a,b,c) == 0) {
            System.out.println("The root is: " + firstRoot(a, b, c));
        }
        else {
            System.out.println("The roots are: " + firstRoot(a, b, c) + " and " + secondRoot(a, b, c));
        }
    }
    // Integer Integer Integer -> double
    // calculates the first root of ax^2 + bx + c = 0
    public static double firstRoot(int a, int b, int c) {
        return ((-b + Math.sqrt(discriminant(a, b, c))) / 2*a);
    }

    // Integer Integer Integer -> double
    // calculates the second root of ax^2 + bx + c = 0
    public static double secondRoot(int a, int b, int c) {
        return ((-b - Math.sqrt(discriminant(a, b, c))) / 2*a);
    }

    // Integer Integer Integer -> Integer
    // calculate the discriminant, which is b^2 - 4ac
    public static int discriminant(int a, int b, int c) {
        return b*b - 4*a*c;
    }
}
