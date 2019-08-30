public class incrementalPractice {
    public static void main(String[] args) {
        printTable(6, 4);
    }

    public static void printTable(int rows, int cols) {
        int i = 0;
        while (i < rows) {
            printRow(cols);
            i++;
        }
    }

    public static void printRow(int n) {
        int i = 0;
        while (i <= 6) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }
}
