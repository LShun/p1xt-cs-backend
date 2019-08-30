import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class IntExponentTest {

    @Test
    void pow() {
        assertEquals(BigInteger.valueOf(1), IntExponent.pow(1, 1));
        assertEquals(BigInteger.valueOf(4), IntExponent.pow(2, 2));
        assertEquals(BigInteger.valueOf(16), IntExponent.pow(4, 2));
    }
}