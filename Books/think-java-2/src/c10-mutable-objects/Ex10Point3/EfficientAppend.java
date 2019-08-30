package Ex10Point3;

import java.util.Scanner;

public class EfficientAppend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            String line = in.nextLine();
            text.append(line);
            text.append('\n');
        }
        System.out.println(text);
    }

}
