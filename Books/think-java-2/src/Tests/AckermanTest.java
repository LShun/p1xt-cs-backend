import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AckermanTest {

    @Test
    void ack() {
        assertEquals(2, Ackerman.ack(0, 1));
        assertEquals(Ackerman.ack(2-1, 1), Ackerman.ack(2, 0));
        assertEquals(Ackerman.ack(2-1, Ackerman.ack(2, 1)), Ackerman.ack(2,2));
    }
}