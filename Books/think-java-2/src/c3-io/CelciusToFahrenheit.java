import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double celcius, fahrenheit;

        System.out.println("Hey, enter a temperature ( in Celsius please): ");
        celcius = in.nextDouble();
        fahrenheit = celcius * (9.0/5.0) + 32;

        System.out.println("Okey dokey, here's your temperature in fahrenheit: " + fahrenheit);
    }
}
