public class PracticeC6 {
    public static void main(String args[]) {
//         blastOff();
//         infiniteLoop();
//         hardToProve();
//         incremental();
//         forLoop();
//         existsInside();
//         nestedLoop();
//         getChar();
//         compareChar();
//        romanAlphabet();
//        greekAlphabet();
//        fruitPrint();
//        lastChar();
//        findIndex();
//        findSecond();
//        compareNamesIncorrectly();
//        compareNamesCorrectly();
//        findStringComingFirst();
//        createSubstring();
        for (int x = 0; x < 24; x++) {
            for (int y = 0; y < 60; y++) {
                System.out.println(timeString(x, y));
            }
        }


    }

    private static void blastOff() {
        int n = 3;
        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("Blastoff!");
    }

    private static void infiniteLoop() {
        int n = 3;
        while (n > 0) {
            System.out.println(n);
        }
    }

    private static void hardToProve() {
        int n = 5;
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {
                n = n / 2; // n is even
            } else {
                n = 3 * n + 1; // n is odd
            }
        }
    }

    private static void incremental() {
        final int limit = 10;
        int i = 0;

        while (i <= 5) {
            System.out.println(i);
            i++; // add 1 to i
        }
    }

    private static void forLoop() {
        for (int i = 2; i <= 8; i += 2) {
            System.out.println(i + ", ");
        }
        System.out.println("who do we appreciate?");
    }

    private static void existsInside() {
        for (int i = 0; i > 0; i--) {
            System.out.println(i);
        }
        // System.out.println("n is now " + i); // compiler error
    }

    private static void nestedLoop() {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.printf("%4d", x * y);
            }
            System.out.println();
        }
    }

    private static void getChar() {
        String fruit = "banana";
        char letter = fruit.charAt(0);
        System.out.println(letter);
    }

    private static void compareChar() {
        char letter = 'a';
        if (letter == 'a') {
            System.out.println('?');
        }
    }

    private static void romanAlphabet() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        System.out.println();
    }

    private static void greekAlphabet() {
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();
    }

    private static void fruitPrint() {
        String fruit = "Fruit";
        for (int i = 0; i < fruit.length(); i++) {
            char letter = fruit.charAt(i);
            System.out.println(letter);
        }
    }

    private static void lastChar() {
        String fruit = "Fruit";
        int length = fruit.length();
        char last = fruit.charAt(length - 1); //correct
        System.out.println(last);
    }

    private static void findIndex() {
        String fruit = "banana";
        System.out.println(fruit.indexOf('a')); // returns 1
    }

    private static void findSecond() {
        String fruit = "banana";
        System.out.println(fruit.indexOf('a', 2)); // returns 3
    }

    // 6.8 string comparison

    private static void compareNamesIncorrectly() {
        String name1 = "Alan Turing";
        String name2 = "Ada Lovelace";
        if (name1 == name2) { // wrong
            System.out.println("The names are the same");
        }
    }

    private static void compareNamesCorrectly() {
        String name1 = "Alan Turing";
        String name2 = "Alan Turing";
        if (name1.equals(name2)) // correct {
            System.out.println("The names are the same.");
    }

    private static void findStringComingFirst() {
        String name1 = "Alax Turing";
        String name2 = "Alan Turing";

        int diff = name1.compareTo(name2);

        if (diff == 0) {
            System.out.println("The names are the same.");
        } else if (diff < 0) {
            System.out.println("name1 comes before name2.");
        } else {
            System.out.println("nam2 comes before name1.");
        }
    }

    private static void createSubstring() {
        String fruit = "banana";
        System.out.println(fruit.substring(0));
        System.out.println(fruit.substring(2));
        System.out.println(fruit.substring(6));
        // overloaded methods
        System.out.println(fruit.substring(0, 3));
        System.out.println(fruit.substring(2, 5));
        System.out.println(fruit.substring(6, 6));
    }

    private static String timeString(int hour, int minute) {
        String ampm;
        if (hour < 12) {
            ampm = "AM";
            if (hour == 0) {
                hour = 12; //midnight
            }
        }
        else {
            ampm = "PM";
            hour = hour - 12;
        }
        return String.format("%02d: %02d %s", hour, minute,ampm);
    }
}


