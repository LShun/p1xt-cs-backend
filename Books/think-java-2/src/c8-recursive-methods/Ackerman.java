public class Ackerman {
    // Int Int -> Int
    // returns the value of the Ackermann Function
    public static int ack(int m, int n) {
        if (m == 0) {
            return n+1;
        }
        else if (m > 0 && n == 0) {
            return ack(m-1, 1);
        }
        else {
            return ack(m-1, ack(m, n-1));
        }
    }
}
