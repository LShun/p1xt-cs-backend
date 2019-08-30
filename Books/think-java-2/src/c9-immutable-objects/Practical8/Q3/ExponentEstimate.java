package Practical8.Q3;

public class ExponentEstimate {
    public static void main(String[] args) {
        System.out.println(myexp(10, 1));
    }
    // Int Int -> Double
    // Estimate e^x by adding the first n terms of this series
    public static double myexp(int n, int x) {
        if (n == 0) {
            return 1;
        }
        else {
            int top = x, bot = 1;
            for (int i = 0; i < (n - 1); i++) {
                top *= x;
            }
            for (int i = 1; i <= n; i++) {
                bot *= i;
            }
            return ((double) top / bot) + myexp(n-1, x);
        }
    }
}
