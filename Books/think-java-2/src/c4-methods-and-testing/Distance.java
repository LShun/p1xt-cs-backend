public class Distance {
    // Double Double Double Double -> Double
    // produces distance between two points
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        System.out.println("dx is: " + dx);
        System.out.println("dy is: " + dy);
        return Math.sqrt(dx + dy); // stub
    }

    public static void main(String args[]) {
        System.out.println(distance(1, 2, 3, 4)); // expect 5
    }
}
