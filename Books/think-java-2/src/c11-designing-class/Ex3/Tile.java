package Ex3;

public class Tile {
    private char letter;
    int value;

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "letter=" + letter +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tile tile = (Tile) o;

        if (getLetter() != tile.getLetter()) return false;
        return getValue() == tile.getValue();
    }

    @Override
    public int hashCode() {
        int result = getLetter();
        result = 31 * result + getValue();
        return result;
    }
}
