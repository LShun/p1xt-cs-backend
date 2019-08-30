package Ex5;

public class Rational {
    int numerator;
    int denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void printRational() {
        System.out.println(
                "Rational: " + this.numerator
                + "/" + this.denominator
        );
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numberator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public void negate() {
        this.numerator = this.numerator * -1;
    }

    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    public double toDouble() {
        return this.numerator / this.denominator;
    }

    public Rational reduce() {
        Rational lowest = this;
        int gcd = gcd(this.numerator, this.denominator);
        return new Rational(numerator/gcd, denominator/gcd);
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public Rational add(Rational r) {
        Rational temp = new Rational(this.numerator, this.denominator);
        this.numerator *= r.denominator;
        this.denominator *= r.denominator;
        r.denominator *= temp.denominator;
        r.numerator *= temp.denominator;
        this.numerator += r.numerator;
        return this.reduce();
    }
}
