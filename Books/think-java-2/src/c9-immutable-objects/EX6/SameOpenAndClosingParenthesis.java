package EX6;

/*
I can generalize it more by allowing the user to set how many parenthesis pairs have not been completed.
 */

import org.w3c.dom.css.Rect;

import java.awt.*;

public class SameOpenAndClosingParenthesis {
    public static void main(String args[]) {
        String s = "((3 + 7) * 2)";
        System.out.println(sameParenthesis(s, 0));
    }

    public static int sameParenthesis(String s, int count) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        return count;
    }
}
