import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class E6maxInRangeTest {

    @Test
    void maxInRange() {
        assertEquals(1,
                E6maxInRange.maxInRange(new int[]{1}, 0, 0));
        assertEquals(2,
                E6maxInRange.maxInRange(new int[]{1, 2}, 0, 1));
        assertEquals(3,
                E6maxInRange.maxInRange(new int[]{3, 2}, 0, 1));
        assertEquals(2,
                E6maxInRange.maxInRange(new int[]{3, 2, 1}, 1, 2));
    }

    @Test
    void max() {
        assertEquals(1, E6maxInRange.max(new int[]{1}));
        assertEquals(2, E6maxInRange.max(new int[]{1,2}));
        assertEquals(10, E6maxInRange.max(new int[]{10, 2, 3, 5}));
    }
}