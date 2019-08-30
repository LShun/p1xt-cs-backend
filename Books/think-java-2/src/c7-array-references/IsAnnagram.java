public class IsAnnagram {
    // String String -> Boolean
    // if both string have the same counts of letters, return true, else, return false
    public static boolean isAnnagram(String a, String b) {
        int[] counts = new int[26];

        for (char c: a.toCharArray()) {
            counts[c - 'a']++;
        }
        for (char c: b.toCharArray()) {
            counts[c - 'a']--;
        }
        for (int i : counts) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
