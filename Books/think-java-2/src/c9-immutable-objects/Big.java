import java.math.BigInteger;

public class Big {
    public static void main(String args[]) {
        for (int i = 0; i <= 999; i++) {
            System.out.println(i + " Factorial : " + factorial(i));
        }
    }
    public static BigInteger factorial(int num) {
        BigInteger f = BigInteger.valueOf(1);
        for(int i = 1; i <= num; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}

/**
 * Display a table of the integers from 0 to 30 along with their factorials.
 * At some point around 15, you will probably see that the answers are not correct anymore.
 * Why not?
 *
 * Buffer overflow. The factorial simply produced a number that is too big to be stored in an int data type.
 *
 *
 */
