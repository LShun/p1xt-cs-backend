public class Power {
    // Double Integer -> Double
    // Calculates the value of x raised to n
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 != 0 || n == 2) {
            return x * power(x, n-1);
        }
        else {
            return power(power(x, n / 2), 2);
        }
    }
}
