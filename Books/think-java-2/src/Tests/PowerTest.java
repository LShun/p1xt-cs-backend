import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {

    @Test
    void power() {
        assertEquals(1, Power.power(0, 0));
        assertEquals(2, Power.power(2, 1));
        assertEquals(8, Power.power(2,3));
        assertEquals(16, Power.power(2, 4));
    }
}