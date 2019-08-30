package Ex3;

public class TestTile {
    public static void printTile(Tile t) {
        System.out.println(
                "Letter: " + t.getLetter() + "\n"
                + "Value: " + t.getValue()
        );
    }

    public static void testTile() {
        Tile t = new Tile('Z', 10);
        printTile(t);
    }

    public static void main(String[] args) {
        testTile();
    }
}
