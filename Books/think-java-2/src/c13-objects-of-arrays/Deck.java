import java.util.Random;

public class Deck {
    private Card[] cards;

    public Deck(int n) {
        this.cards = new Card[n];
    }

    public Deck() {
        this.cards = new Card[52];
        int index = 0;

        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        int swap;

        for (int i = 0; i < cards.length; i++) {
            swap = randomInt(i, cards.length);
            swapCards(i, swap);
        }
    }

    private static int randomInt(int low, int high) {
        // return random number between low and high, high and low must not be negative
        Random r = new Random();
        return r.nextInt(high);
    }

    private void swapCards(int i, int j) {
        // swap the ith and the jth cards in the array
        Card temp = cards[i];
        cards[i] = cards[j];
        cards[j] = temp;
    }

    public Card[] getCards() {
        return this.cards;
    }

    // TODO: Selection Sort
    public void selectionSort() {
        int lowest;
        for (int i = 0; i < this.cards.length; i++) {
            // find the lowest card at or to the right of i
            lowest = indexLowest(i, this.cards.length);
            // swap the ith card and the lowest card found
            swapCards(i, lowest);
        }
    }

    public int indexLowest(int low, int high) {
        // find the lowest card between low and high
        int index = low;
        Card card = this.cards[low];

        for (int i = low+1; i < high; i++) {
            if (card.compareTo(this.cards[i]) == 1) {
                index = i;
                card = this.cards[i];
            }
        }
        return index;
    }

    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    public static Deck merge(Deck d1, Deck d2) {
        // create a new deck big enough for all the cards
        Deck d3 = new Deck(d1.cards.length + d2.cards.length);

        // use the index i to keep track of where we are at in
        // the first index, and the index j for the second deck

        int i = 0;
        int j = 0;

        // the index k traverses the result deck
        for (int k = 0; k < d3.cards.length; k++) {
            // if d1 is empty, use top card from d2
            if (d1.subdeck(i, d1.cards.length - 1).cards.length == 0) {
                d3.cards[k] = d2.cards[j++];
            }
            // if d2 is empty, use top card from d1
            else if (d2.subdeck(j, d2.cards.length - 1).cards.length == 0) {
                d3.cards[k] = d1.cards[i++];
            }
            // otherwise, compare top two cards
            else {
                // add lowest card to the new deck at k
                // increment i or j (depending on card)
                if (d1.cards[i].compareTo(d2.cards[j]) == -1) {
                    d3.cards[k] = d1.cards[i++];
                }
                else {
                    d3.cards[k] = d2.cards[j++];
                }
            }
        }
        return d3;
    }

    public Deck almostMergeSort() {
        Deck d1;
        Deck d2;
        int deckLength = this.cards.length;

        // divide the deck into two subdecks
        d1 = this.subdeck(0, deckLength / 2 - 1);
        d2 = this.subdeck(deckLength / 2, deckLength - 1);
        // sort the subdecks using selectionSort
        d1.selectionSort();
        d2.selectionSort();
        // merge the subdecks, return the results
        return merge(d1, d2);
    }

    public Deck mergeSort() {
        // if the deck has 0 or 1 cards, return it
        int deckLength = this.cards.length;
        if (deckLength <= 1) {
            return this;
        }
        else {
            // divide the deck into two subdecks
            Deck d1 = this.subdeck(0, deckLength / 2 - 1);
            Deck d2 = this.subdeck(deckLength / 2, deckLength - 1);
            // sort the subdecks using mergeSort
            d1 = d1.mergeSort();
            d2 = d2.mergeSort();
            // merge the subdecks, return the results
            return merge(d1, d2);
        }
    }

    public void insertionSort() {
        // for every card
        for (int i = 1; i < this.cards.length; i++) {
            insert(i);
        }
    }

    public void insert(int index) {
        for (int i = index; i > 0 && this.cards[i].compareTo(this.cards[i - 1]) == -1; i--) {
            swapCards(i, i-1);
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Card c : cards) {
            string.append(c.toString() + " ");
        }
        return string.toString();
    }
}
