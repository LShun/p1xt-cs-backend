import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SieveOfEratosthenesTest {

    @Test
    void sieve() {
        assertArrayEquals(new boolean[] {false, false}, SieveOfEratosthenes.sieve(2));
        assertArrayEquals(new boolean[] {false, false, true}, SieveOfEratosthenes.sieve(3));
        assertArrayEquals(new boolean[] {false, false, true, true}, SieveOfEratosthenes.sieve(4));
        assertArrayEquals(new boolean[] {false, false, true, true, false}, SieveOfEratosthenes.sieve(5));
    }
}