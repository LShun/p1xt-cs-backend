package test;

import model.Coin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CoinTest {
    final int FLIPS = 10;
    final int REPEATS = 5;

    // REQUIRES: results size > 1
    @Test
    public void testAlwaysSameValue() {
        // check if all produce same result
        assertFalse(alwaysSameValue(FLIPS));
    }

    @Test
    public void testRepeatedSameValue() {
        // check if a coin consistently produces one value n times
        assertFalse(repeatedSameValue(FLIPS, REPEATS));
    }

    @Test
    public void testRepeatedDifferentValue() {
        // check if a coin consistently produces value in an alternating pattern n times
        assertFalse(consecutiveDifferentValue(FLIPS, REPEATS));
    }

    private boolean consecutiveDifferentValue(int flips, int repeats) {
        Coin c = new Coin();
        int count = 0;
        int repeatedValue;

        // flip the coin flips times
        c.flip();
        repeatedValue = c.checkStatus();
        for (int i = 0; i < flips-1; i++) {
            c.flip();
            if (c.checkStatus() == repeatedValue) {
                count++;
                if (count >= repeats) {
                    return true;
                }
            }
            else {
                count = 0;
                repeatedValue = c.checkStatus();
            }
        }
        return false;
    }

    public boolean alwaysSameValue(int flips) {
        Coin c = new Coin();
        int repeatedValue;

        // flip the coin flips time
        c.flip();
        repeatedValue = c.checkStatus();
        for (int i = 0; i < flips-1; i++) {
            c.flip();
            if (c.checkStatus() == repeatedValue) {
                continue;
            }
            else {
                // if value changes, return false
                return false;
            }
        }
        // if value do not change at all, return true
        return true;
    }

    public boolean repeatedSameValue(int flips, int repeats) {
        Coin c = new Coin();
        int count = 0;
        int repeatedValue;

        // flip the coin flips times
        c.flip();
        repeatedValue = c.checkStatus();
        for (int i = 0; i < flips-1; i++) {
            c.flip();
            if (c.checkStatus() == repeatedValue) {
                count++;
                if (count >= repeats) {
                    return true;
                }
            }
            else {
                count = 0;
                repeatedValue = c.checkStatus();
            }
        }
        return false;
    }
}
