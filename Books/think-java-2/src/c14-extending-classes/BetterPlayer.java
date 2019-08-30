public class BetterPlayer extends Player {
    public BetterPlayer(String name) {
        super(name);
    }

    @Override
    public Card play(Eights eights, Card prev) {
        Card card = searchForMatch(prev);
        if (card == null) {
            card = drawForMatch(eights, prev);
        }
        return card;
    }

    public Card searchForMatch(Card prev) {
        int bestMatch = -1;
        for (int i = 0; i < hand.size(); i++) {
            Card possible = hand.getCard(i);
            if (cardMatches(possible, prev)) {
                // check if bestMatch is none
                if (bestMatch == -1) {
                    bestMatch = i;
                }
                // check if it is a "eights":
                if (possible.getRank() == 8) {
                    return hand.popCard(i);
                }
                // check if it is a larger rank, but equal suit
                if (possible.getRank() > hand.getCard(bestMatch).getRank()) {
                    bestMatch = i;
                }
            }
        }
        if (bestMatch != -1) {
            return hand.popCard(bestMatch);
        }
        return null;
    }
}
