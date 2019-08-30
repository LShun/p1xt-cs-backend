import java.util.ArrayList;
import java.util.Random;

public class CardCollection {
    private String label;
    private ArrayList<Card> cards;

    public CardCollection(String label) {
        this.label = label;
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card popCard(int i) {
        return cards.remove(i);
    }

    public Card popCard() {
        int i = size() - 1;
        return popCard(i);
    }

    public int size() {
        return cards.size();
    }

    public boolean empty() {
        return cards.size() == 0;
    }

    public Card getCard(int i) {
        return cards.get(i);
    }

    public Card lastCard() {
        int i = size() - 1;
        return cards.get(i);
    }

    public void swapCards(int i, int j) {
        Card temp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, temp);
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = size() - 1; i > 0; i--) {
            int j = random.nextInt(i);
            swapCards(i, j);
        }
    }

    public String getLabel() {
        return label;
    }

    public void deal(CardCollection that, int n) {
        for (int i = 0; i < n; i++) {
            Card card = popCard();
            that.addCard(card);
        }
    }

    public void dealAll(CardCollection that) {
        int n = size();
        deal(that, n);
    }
}
