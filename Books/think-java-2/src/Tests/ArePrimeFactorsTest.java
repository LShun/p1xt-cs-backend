import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArePrimeFactorsTest {

    @Test
    void arePrimeFactors() {
        // all prime, all factors
        assertTrue(ArePrimeFactors.arePrimeFactors(2, new int[] {2}));
        // not all prime, all factors
        assertFalse(ArePrimeFactors.arePrimeFactors(2, new int[] {1,2}));
        // not all prime, not all factors
        assertFalse(ArePrimeFactors.arePrimeFactors(2, new int[] {1}));
        // all prime, not all factors
        assertFalse(ArePrimeFactors.arePrimeFactors(3, new int[] {2}));
    }
}