public class RecursiveBinary {
    public static void main(String argsp[]) {
        displayBinary(24);
    }

    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
            String apple = "apple";
        }
    }

    public String noX(String str) {
        if (str.length() != 0) {
            if (str.charAt(0) == 'x') {
                noX(str.substring(1));
            } else {
                return str.charAt(0) + noX(str.substring(1));
            }
        }
        return str;
    }

}
