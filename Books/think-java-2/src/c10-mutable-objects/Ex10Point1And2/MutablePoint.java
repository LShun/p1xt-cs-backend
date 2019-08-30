package Ex10Point1And2;

import java.awt.Point;

public class MutablePoint {

    public static void printPoint(Point p) {
        System.out.println("(" + p.x + "," + p.y + ")");
        System.out.println(p);
    }

    public static double distance(Point p1, Point p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return p1.distance(p2); // dist is 5.0
    }
}
