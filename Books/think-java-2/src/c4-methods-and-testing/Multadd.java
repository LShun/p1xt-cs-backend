public class Multadd {
    public static void main(String args[]) {
        System.out.println(multadd(1.0, 2.0, 3.0));
        System.out.println(multadd(1/2, (Math.cos(Math.PI / 4) / 2), Math.sin(Math.PI / 4)));
        System.out.println(multadd(Math.log10(20), 1, Math.log10(10)));
        System.out.println(expSum(2));

    }
    // Double Double Double -> Double
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // Double -> Double
    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }
}
