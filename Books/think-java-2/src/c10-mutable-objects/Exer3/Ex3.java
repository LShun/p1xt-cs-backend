package Exer3;

import java.awt.*;

import static Ex10Point1And2.MutablePoint.printPoint;
import static Ex10Point3.MutableRectangle.findCenter;

public class Ex3 {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(2, 4, 7, 9);
        Point p1 = findCenter(box1);
        printPoint(p1);

        box1.grow(1, 1);
        Point p2 = findCenter(box1);
        printPoint(p2);
    }
}
