package Exercises;

import javax.swing.*;
import java.awt.*;

public class JapanFlag extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Japan Flag");
        Canvas canvas = new JapanFlag();
        canvas.setSize(600, 300);
        frame.add(canvas);
        frame.pack();
        frame.setBackground(Color.white);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(250, 100, 100, 100);
    }
}
