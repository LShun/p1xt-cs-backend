public class Recurse {
    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }

    /**
     * String -> Void
     * Display letter on the screen, one on a line
     */
    public static void printString(String s) {
        if (s.length() == 0) {
            return;
        }
        else  {
            System.out.println(first(s));
            printString(rest(s));
        }
    }

    /**
     *  String -> Void
     *  Prints a string on screen backwards, one at a time
     */
    public static void reverseString(String s) {
        if (s.length() == 0) {
            return;
        }
        else {
            reverseString(rest(s));
            System.out.println(first(s));
        }
    }

    /**
     * String -> Boolean
     * Determines if a string is a palindrome:
     * One-letter string is palindrome
     * If palindrome
     * - First letter and last letter are same
     * - Middle is palindrome
     */

    public static boolean isPalindrome(String s) {
        if (length(s) == 1) {
            return true;
        }
        if (length(s) == 2) {
            if (first(s) == first(rest(s))) {
                return true;
            }
        }
        else {
            String seek = s;
            while (length(seek) != 1) {
                seek = rest(seek);
            }
            char last = first(seek);
            if (first(s) == last) {
                return isPalindrome(middle(s));
            }
        }
        return false;
    }
}
