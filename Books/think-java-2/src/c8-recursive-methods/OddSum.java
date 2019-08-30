public class OddSum {
    // Integer -> Integer
    // returns the sum of odd numbers from 1 to n
    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        }
        if (!(n % 2 == 0)) {
            return n + oddSum(n-2);
        }
        else {
            return oddSum(n-1);
        }
    }
}
