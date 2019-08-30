import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecurseTest {

    @Test
    void first() {
        assertEquals('T', Recurse.first("Template"));
    }

    @Test
    void rest() {
        assertEquals("read", Recurse.rest("Bread"));
    }

    @Test
    void middle() {
        assertEquals("read", Recurse.middle("Breads"));
    }

    @Test
    void length() {
        assertEquals(7, Recurse.length("pudding"));
    }

    @Test
    void printString() {
        Recurse.printString("Palindrome");
    }

    @Test
    void reverseString() {
        Recurse.reverseString("emordnilaP");
    }

    @Test
    void isPalindrome() {
        assertTrue(Recurse.isPalindrome("b"));
        assertTrue(Recurse.isPalindrome("boob"));
        assertFalse(Recurse.isPalindrome("soop"));
    }
}