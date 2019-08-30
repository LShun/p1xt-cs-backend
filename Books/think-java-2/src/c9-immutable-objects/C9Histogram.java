public class C9Histogram {
    // Integer[] -> Integer[100]
    // return a histogram with a counter of 100 numbers
    public static void main(String args[]) {
        int[] marks = new int[]{1,5,10,15,20,25,30};
        int[] histogram = histogram(marks);
    }

    private static int[] histogram(int[] marks) {
        int[] histogram = new int[100];
        for (int value : marks) {
            histogram[value]++;
        }
        return histogram;
    }

}
