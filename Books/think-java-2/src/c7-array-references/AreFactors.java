public class AreFactors {
    // int int[] -> boolean
    // return true if all numbers in loi is a factor of i, otherwise false
    public static boolean areFactors(int i, int[] loi) {
        for (int n : loi) {
            if (i % n != 0) {
                return false;
            }
        }
        return true;
    }
}
