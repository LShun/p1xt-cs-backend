public class CardDriver {
    public static void main(String[] args) {
        Card threeOfClubs = new Card(3, 0);
        System.out.println(threeOfClubs);

        Card[] cards = new Card[52];

        if (cards[0] == null) {
            System.out.println("No card yet!");
        }

        cards = makeDeck();
        printDeck(cards);
        System.out.println(binarySearch(cards, threeOfClubs, 0, cards.length));
        System.out.println((new Card(1, 2)).compareTo(new Card(12, 2)));
        int[] hist = suitHist(cards);
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println(Card.SUITS[i] + ": " + hist[i]);
        }

    }

    private static Card[] makeDeck() {
        Card[] cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank,suit);
                index++;
            }
        }
        return cards;
    }

    public static int search(Card[] cards, Card target) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void printDeck(Card[] cards) {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public static int binarySearch(Card[] cards, Card target, int low, int high) {

        if (high < low) {
            return -1;
        }
        int mid = (low + high) /2;
        int comp = cards[mid].compareTo(target);

        if (comp == 0) {
            return mid;
        }
        else if (comp < 0) {
            binarySearch(cards, target, mid + 1, high);
        } else {
            return binarySearch(cards, target, low, mid - 1);
        }

        return -1;
    }

    private static int[] suitHist(Card[] cards) {
        int[] suits = new int[4];
        for (Card card : cards) {
            suits[card.getSuit()]++;
        }
        return suits;
    }

    public static boolean hasFlush(Card[] c) {
        int[] suits = suitHist(c);
        for (int s : suits) {
            if (s >= 5) {
                return true;
            }
        }
        return false;
    }
}
