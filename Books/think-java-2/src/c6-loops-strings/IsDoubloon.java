import java.util.Scanner;

public class IsDoubloon {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String word;

        System.out.println("Enter a word: ");
        word = in.nextLine();

        if (isDoubloon(word)) {
            System.out.println(word + " is a doubloon!");
        }
        else {
            System.out.println(word + " is not a doubloon!");
        }
    }

    // String -> Boolean
    // returns true if every letter appears in the word exactly twice
    public static Boolean isDoubloon(String s) {
        s = s.toLowerCase();
        for (int i = 'a'; i < 'z'; i++) {
            // if there is none
            int first = s.indexOf(i);
            int second = s.indexOf(i, first + 1);
            int third = s.indexOf(i, second + 1);

            if (first == -1) {
                continue;
            }
            else if (second == -1 || third != -1) {
                return false;
            }
        }

        return true;
    }
}
