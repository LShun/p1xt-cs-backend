import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsAnnagramTest {

    @Test
    void isAnnagram() {
        assertTrue(IsAnnagram.isAnnagram("", ""));
        assertTrue(IsAnnagram.isAnnagram("a", "a"));
        assertFalse(IsAnnagram.isAnnagram("a", "b"));
        assertTrue(IsAnnagram.isAnnagram("ab", "ba"));
        assertFalse(IsAnnagram.isAnnagram("ab", "a"));
    }
}