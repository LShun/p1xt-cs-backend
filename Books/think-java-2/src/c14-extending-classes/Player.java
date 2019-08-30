public class Player {

    private String name;
    protected Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand(name);
    }

    public Card play(Eights eights, Card prev) {
        Card card = searchForMatch(prev);
        if (card == null) {
            card = drawForMatch(eights, prev);
        }
        return card;
    }

    public Card searchForMatch(Card prev) {
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.getCard(i);
            if (cardMatches(card, prev)) {
                return hand.popCard(i);
            }
        }
        return null;
    }

    public Card drawForMatch(Eights eights, Card prev) {
        while (true) {
            Card card = eights.drawCard();
            System.out.println(name + " draws " + card);
            if (cardMatches(card, prev)) {
                return card;
            }
            hand.addCard(card);
        }
    }

    public static boolean cardMatches(Card card1, Card card2) {
        if (card1.getSuit() == card2.getSuit()) {
            return true;
        }
        if (card1.getRank() == card2.getRank()) {
            return true;
        }
        if (card1.getRank() == 8) {
            return true;
        }
        return false;
    }

    public int displayScore() {
        int score = 0;
        for (int i = 0; i < hand.size(); i++) {
            if (hand.getCard(i).getRank() == 8) {
                score += 80;
            }
            if (hand.getCard(i).getRank() > 10) {
                score += 10;
            }
            score += hand.getCard(i).getRank();
        }
        return score;
    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }
}


