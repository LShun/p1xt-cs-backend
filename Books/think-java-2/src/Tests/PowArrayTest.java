import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowArrayTest {

    @Test
    void powArray() {
        assertArrayEquals(new double[]{1,4,9,16}, PowArray.powArray(new double[]{1,2,3,4}));
        assertArrayEquals(new double[]{64}, PowArray.powArray(new double[]{8}));
    }
}