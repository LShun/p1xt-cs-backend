// Abcderian.java
// determines if every letter in the word appears in alphabetical order
// ASSUME: each letter must come later than the last alphabet

public class Abcderian {
    // String -> Boolean
    // return true if the given String is Abcdarian, else false
    public static boolean isAbcdarian(String s) {
        for(int i = 1; i < s.length(); i++) {
            if (s.charAt(i) <= s.charAt(i-1)) {
                return false;
            }
        }
        return true;
    }
}
