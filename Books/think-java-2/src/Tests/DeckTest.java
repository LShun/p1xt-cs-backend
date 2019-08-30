import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void merge() {
        // create new deck
        Deck d0 = new Deck();
        // shuffle them
        d0.shuffle();
        // cut it into two halves, and selection sort each halves.
        Deck d1 = d0.subdeck(0, 25);
        d1.selectionSort();
        Deck d2 = d0.subdeck(26, 51);
        d2.selectionSort();
        // merge them together, check output
        assertArrayEquals(new Deck().getCards(), Deck.merge(d1, d2).getCards());
    }

    @Test
    void indexLowest() {
        assertEquals(0, new Deck().indexLowest(0, 52));
        assertEquals(30, new Deck().indexLowest(30, 52));
    }

    @Test
    void print() {
    }

    @Test
    void shuffle() {
    }

    @Test
    void getCards() {
    }

    @Test
    void selectionSort() {
    }

    @Test
    void subdeck() {
    }

    @Test
    void almostMergeSort() {
        Deck d1 = new Deck();
        d1.shuffle();
        assertArrayEquals(new Deck().getCards(), d1.almostMergeSort().getCards());
    }

    @Test
    void mergeSort() {
        Deck d1 = new Deck();
        d1.shuffle();
        assertArrayEquals(new Deck().getCards(), d1.mergeSort().getCards());
    }

    @Test
    void testToString() {
    }

    @Test
    void insertionSort() {
        Deck d1 = new Deck();
        d1.shuffle();
        d1.insertionSort();
        assertArrayEquals(new Deck().getCards(), d1.getCards());
    }

    @Test
    void insert() {
    }

    @Test
    void testToString1() {
    }
}