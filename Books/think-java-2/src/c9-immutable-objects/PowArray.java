
public class PowArray {
    // double[] -> double[]
    // returns the array with all the values squared

    public static double[] powArray(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] *= a[i];
        }
        return a;
    }

}

