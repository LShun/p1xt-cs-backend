public class ArePrimeFactors {
    public static boolean arePrimeFactors(int n, int[] loi) {
        boolean[] primes = SieveOfEratosthenes.sieve(n + 1);

        // if all number in array times together = n, continue, otherwise, return false
        int product = 1;
        for (int i : loi) {
            product *= i;
        }
        if (product != n) {
            return false;
        }

        // if all is prime, return true, else, return false
        for (int i : loi) {
            // if number is not a factor (bigger than n)
            if (i > n || !(primes[i])) {
                return false;
            }
        }
        return true;
    }
}
