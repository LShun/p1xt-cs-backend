public class WarGame {
    public static void main(String[] args) {
        // create and shuffle the deck
        Deck deck = new Deck();
        deck.shuffle();

        // divide the deck into piles
        Pile p1 = new Pile();
        p1.addDeck(deck.subdeck(0, 25));
        Pile p2 = new Pile();
        p2.addDeck(deck.subdeck(26,51));

        // pile to store cards in case of tie
        Pile tiebreaker = new Pile();

        // while both piles are not empty
        while (p1.size() > 0 && p2.size() > 0) {
            Card c1 = p1.popCard();
            Card c2 = p2.popCard();

            // compare the cards
            int diff = c1.getRank() - c2.getRank();
            if (diff > 0) {
                p1.addCard(c1);
                p1.addCard(c2);
                while (tiebreaker.size() != 0) {
                    p1.addCard(tiebreaker.popCard());
                }
            } else if (diff < 0) {
                p2.addCard(c1);
                p2.addCard(c2);
                while (tiebreaker.size() != 0) {
                    p2.addCard(tiebreaker.popCard());
                }
            } else {
                if (p1.size() < 4 || p2.size() < 4) {
                    break;
                }
                // its a tie...draw four more cards
                tiebreaker.addCard(c1);
                tiebreaker.addCard(c2);
                // add 3 more cards from each pile
                for (int i = 0; i < 2; i++) {
                    tiebreaker.addCard(p1.popCard());
                    tiebreaker.addCard(p2.popCard());
                }
            }
        }

        if (p1.size() > p2.size()) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
