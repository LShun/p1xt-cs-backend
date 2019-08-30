import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddSumTest {

    @Test
    void oddSum() {
        assertEquals(1, OddSum.oddSum(1));
        assertEquals(1, OddSum.oddSum(2));
        assertEquals(4, OddSum.oddSum(4));
    }
}