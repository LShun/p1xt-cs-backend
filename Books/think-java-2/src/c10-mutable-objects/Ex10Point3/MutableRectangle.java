package Ex10Point3;

import java.awt.*;

public class MutableRectangle {

    public static void main(String[] args) {
        Rectangle box = new Rectangle(0, 0, 100, 200);

        moveRect(box, 40, 40);
        System.out.println(box);
        System.out.println(box.width);   // box.width is 100
        box.grow(50, 50);          // grow box1 (alias)
        System.out.println(box.width);  // box.width is 200
    }

    private static void moveRect(Rectangle box, int dx, int dy) {
        box.x = box.x + dx;
        box.y = box.y + dy;
    }

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }
}
