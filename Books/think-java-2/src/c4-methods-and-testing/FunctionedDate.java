public class FunctionedDate {

    // String Int String Int -> Void
    //produces the date format in American format
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, int month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String args[]) {
        System.out.println("Hello World!");

        String day = "Saturday";
        int date = 8;
        String month = "July";
        int year = 2019;

        // American Format
        printAmerican(day, date, month, year);

        // European Format
        System.out.println(day + " " + date + " " + month + " " + year);

        
    }
}