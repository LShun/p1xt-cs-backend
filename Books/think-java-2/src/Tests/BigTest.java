import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigTest {

    @Test
    void factorial() {
        assertEquals(1, Big.factorial(0));
        assertEquals(1, Big.factorial(1));
        assertEquals(2, Big.factorial(2));
        assertEquals(6, Big.factorial(3));
    }
}