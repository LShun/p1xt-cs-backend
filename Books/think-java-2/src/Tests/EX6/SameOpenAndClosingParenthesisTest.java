package EX6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameOpenAndClosingParenthesisTest {

    @Test
    void sameParenthesis() {
        assertEquals(0, SameOpenAndClosingParenthesis.sameParenthesis("()", 0));
        assertEquals(1, SameOpenAndClosingParenthesis.sameParenthesis("(", 0));
        assertEquals(-1, SameOpenAndClosingParenthesis.sameParenthesis(")", 0));
        assertEquals(1, SameOpenAndClosingParenthesis.sameParenthesis("(abc()", 0));
        assertEquals(-1, SameOpenAndClosingParenthesis.sameParenthesis("(def))", 0));
        assertEquals(0, SameOpenAndClosingParenthesis.sameParenthesis("(def(abc)def)", 0));
    }
}