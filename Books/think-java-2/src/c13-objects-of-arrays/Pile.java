import java.util.ArrayList;

public class Pile {
    private ArrayList<Card> cards;

    public Pile() {
        this.cards = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public Card popCard() {
        return this.cards.remove(0);
    }

    public int size() {
        return this.cards.size();
    }

    public void addDeck(Deck deck) {
        for (Card card : deck.getCards()) {
            this.cards.add(card);
        }
    }
}
