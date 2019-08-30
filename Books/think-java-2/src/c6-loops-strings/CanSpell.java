import java.util.Scanner;

public class CanSpell {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String tiles, attempt;

        System.out.print("Enter your tiles: ");
        tiles = in.nextLine();
        System.out.print("Enter your attempt to spell: ");
        attempt = in.nextLine();

        if (canSpell(tiles, attempt) == true)
        {
            System.out.println("That can be spelled!");
        }
        else {
            System.out.println("Nah, that can't be spelled with the tiles you have.");
        }
    }

    // String String -> Boolean
    // return true if all the characters inside 'spell' is inside 'tiles'.
    // NOTE: Each character in 'tiles' can only be used once
    public static boolean canSpell(String tiles, String spell) {
        for(int i = 0; i < spell.length(); i++) {
            char match = spell.charAt(i);
            int index = tiles.indexOf(match);
            if (index != -1) {
                tiles = tiles.substring(0, index) + tiles.substring(index+1);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
