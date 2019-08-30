import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreFactorsTest {

    @Test
    void areFactors() {
        assertTrue(AreFactors.areFactors(1, new int[]{1}));
        assertTrue(AreFactors.areFactors(2, new int[]{1, 2}));
        assertFalse(AreFactors.areFactors(1, new int[]{1, 2}));
        assertTrue(AreFactors.areFactors(2, new int[]{2}));
    }
}