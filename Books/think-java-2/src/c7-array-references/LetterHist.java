public class LetterHist {
    // String -> Int[]
    // returns the count of each letters inside s
    // note: ignore case
    public static int[] letterHist(String s) {
        int[] counts = new int[26];
        for (char c: s.toLowerCase().toCharArray()) {
            int pos = c - 'a';
            counts[pos]++;
        }
        return counts;
    }
}
