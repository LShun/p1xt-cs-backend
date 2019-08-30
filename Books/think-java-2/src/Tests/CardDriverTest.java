import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardDriverTest {

    @Test
    void hasFlush() {
        assertTrue(CardDriver.hasFlush(new Card[]{new Card(3, 1), new Card(4, 1), new Card(5, 1), new Card(6,1), new Card(7,1)}));
        assertFalse(CardDriver.hasFlush(new Card[]{new Card(3, 1), new Card(4, 1), new Card(5, 2), new Card(6,1), new Card(7,1)}));
        assertFalse(CardDriver.hasFlush(new Card[]{new Card(3, 1), new Card(4, 1), new Card(5, 1)}));
    }
}