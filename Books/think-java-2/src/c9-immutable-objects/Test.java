public class Test {
    public static void main(String[] args) {
        String s = "Fire";
        String s2 = "Water";
        char c = 'd';
        char c2 = 'e';
        int i = 4;
        int i2 = 8;
        double d = 3.142;
        double d2 = 4.123;
        boolean b = false;
        boolean b2 = true;

//        boolean b3 = b + b2;
//        b3 = b + c;
//        b3 = b + i;
//        b3 = b + d;
        String s3 = b + s;

//        char c3 = c + b;
        char c3 = (char) (c + c2);
        c3 = (char) (c + i);
        c3 = (char) (c + d);

        System.out.println(c3);

        System.out.println(s3);

        s = c3 + "";
    }
}
