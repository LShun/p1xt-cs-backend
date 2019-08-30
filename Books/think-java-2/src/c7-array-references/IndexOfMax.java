public class IndexOfMax {

    /*  QUESTION    :   Can you write this method using an enhanced for loop? Why or why not?
        ANSWER      :   No, because when you use an enhanced for loop, we can't keep track of the index as the information
                        is lost. We will end up using a 'tracker' to keep track of the location, and hence it is
                        considered a for-loop again.
     */

    // int[] -> Integer
    // Returns the index of the largest element
    public static int indexOfMax(int[] loi) {
        if (loi.length == 0) {
            return -1;
        }

        int max = loi[0], index = 0;

        for (int i = 1; i < loi.length; i++) {
            if (loi[i] > max) {
                index = i;
                max = loi[i];
            }
        }
        return index;
    }
}
