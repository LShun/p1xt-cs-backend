import java.util.ArrayList;
import java.util.Scanner;

public class Eights {
    private ArrayList<Player> players = new ArrayList<>();
    private Hand drawPile;
    private Hand discardPile;
    private Scanner in;

    public Eights() {
        ImprovedDeck deck = new ImprovedDeck("Deck");
        deck.shuffle();

        // initialize the instance variables
        players.add(new Player("one"));
        players.add(new BetterPlayer("two"));
        players.add(new Player("three"));
        drawPile = new Hand("Draw Pile");
        discardPile = new Hand("Discard pile");

        // deal cards like section 14.3
        for (Player p : players) {
            deck.deal(p.hand, 5);
        }
        deck.deal(discardPile, 1);
        deck.dealAll(drawPile);
    }

    public boolean isDone() {
        for (Player p : players) {
            if (p.getHand().empty()) {
                return true;
            }
        }
        return false;
    }

    public void reshuffle() {
        Card prev = discardPile.popCard();
        discardPile.dealAll(drawPile);
        discardPile.addCard(prev);
        drawPile.shuffle();
    }

    public Card drawCard() {
        if (drawPile.empty()) {
            reshuffle();
        }
        return drawPile.popCard();
    }

    public Player nextPlayer(Player current) {
        for (int i = 0; i < players.size() - 1; i++) {
            if (players.get(i).equals(current)) {
                return players.get(i+1);
            }
        }
        return players.get(0);
    }

    public void displayState() {
        // TODO
        // display hand of each player
//        System.out.println("Player 1's Hand: " + one.getHand().size() + "cards");
//        System.out.println("Player 2's Hand: " + two.getHand().size() + "cards");
//        // display contents of discard pile
//        System.out.println("Discard pile: " + discardPile.size() + "cards");
//        // display how many cards in the draw pile
//        System.out.println("Draw Pile: " + drawPile.size() + "cards");
    }

    public void takeTurn(Player player) {
        Card prev = discardPile.lastCard();
        Card next = player.play(this, prev);
        discardPile.addCard(next);

        System.out.println(player.getName() + " plays " + next);
        System.out.println();
    }

    public void playGame() {
        Player player = players.get(0);

        // keep playing until there is a winner
        while (!isDone()) {
            displayState();
            takeTurn(player);
            player = nextPlayer(player);
        }

        // display the final score
        for (Player p : players) {
            System.out.println("Player " + p.getName() + ": " + p.displayScore() + "score");
        }
    }

    public Player winner() {
        int lowest = players.get(0).displayScore();
        int index = 0;

        for (int i = 1; i < players.size(); i++) {
            if (players.get(i).displayScore() < lowest) {
                lowest = players.get(i).displayScore();
                index = i;
            }
        }
        return players.get(index);
    }
}
