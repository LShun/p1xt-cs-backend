public class SieveOfEratosthenes {

    // Integer -> Boolean Array
    // return a list of boolean indicating whether the numbers from 0 to n-1 is prime
    public static boolean[] sieve(int n) {
        boolean[] lob = new boolean[n];

        for (int i = 0; i < n; i++) {
            lob[i] = true;
        }

        // 0 and 1 are non-prime
        lob[0] = false;
        lob[1] = false;

        // eliminate non-prime numbers
        for (int p = 2; p < n; p++) {
            // if p is a prime
            if (lob[p] == true) {
                // eliminate all multiples of p (essentially non-prime) starting from p^2
                for (int i = p*p; i < n; i *= p) {
                    lob[i] = false;
                }
            }
        }

        return lob;
    }
}
