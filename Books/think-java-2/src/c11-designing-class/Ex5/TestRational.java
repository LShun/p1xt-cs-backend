package Ex5;

public class TestRational {
    public static void main(String[] args) {
        Rational r = new Rational();
        r.printRational();
        r.setDenominator(8);
        r.setNumerator(4);
        r.printRational();
        System.out.println(r.toString());
        r.negate();
        r.printRational();
        r.invert();
        r.printRational();
        Rational least = r.reduce();
        least.printRational();
        r.add(new Rational(-4, 2)).printRational();
    }
}
