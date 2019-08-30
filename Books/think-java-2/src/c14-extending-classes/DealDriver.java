import java.util.ArrayList;

public class DealDriver {
    public static void main(String[] args) {
        ArrayList<Player> winners = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Eights e = new Eights();
            e.playGame();
            winners.add(e.winner());
        }
        for (int i = 0; i < winners.size(); i++) {
            System.out.println("Winner is :" + winners.get(i).getName());
        }
    }

}
