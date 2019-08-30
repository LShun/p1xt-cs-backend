package Example;

import javax.swing.*;
import java.awt.*;

public class Drawing extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Example.Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.green);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        Color purple = new Color(128, 0, 128);
        g.setColor(purple);
        mickey(g, new Rectangle(150, 150, 100, 100));
    }

    private void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }

    private void mickey(Graphics g, Rectangle bb) {
        if (bb.width < 3) {
            return;
        }
        boxOval(g, bb);

        int dx = bb.width / 2;
        int dy = bb.height / 2;
        Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);

        half.translate(- dx / 2, - dy / 2);
        mickey(g, half);

        half.translate(dx * 2, 0);
        mickey(g, half);
    }
}
