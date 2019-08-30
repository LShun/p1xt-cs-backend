public class E6maxInRange {
    // Integer[] Integer Integer -> Integer
    // returns the highest number inside loi between lowIndex and highIndex indexes (including bounds) inside array
    public static int maxInRange(int[] loi, int lowIndex, int highIndex) {
        if (loi.length == 0 || lowIndex < 0 || highIndex > loi.length || lowIndex == highIndex) {
            return loi[lowIndex];
        }
        else {
            int firstMax = maxInRange(loi, lowIndex, (lowIndex + highIndex - 1)/2);
            int secondMax = maxInRange(loi, (lowIndex + highIndex + 1)/2, highIndex);
            if (firstMax > secondMax) {
                return firstMax;
            }
            else {
                return secondMax;
            }
        }
    }

    // Int[] -> Int
    // returns the largest value inside the array
    public static int max(int[] loi) {
        return maxInRange(loi, 0, loi.length - 1);
    }
}
