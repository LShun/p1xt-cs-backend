public class MyExp {
    // int int -> double
    public static int myexp(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int recurse = myexp(x, n - 1);
        int result = n * recurse;
        return result;
    }
}
