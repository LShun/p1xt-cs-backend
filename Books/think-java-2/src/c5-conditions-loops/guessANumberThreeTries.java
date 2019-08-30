import java.util.Scanner;
import java.util.Random;

public class guessANumberThreeTries {
    // function to accept input & print results
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random random = new Random();
        int answer = 1 + random.nextInt(100);
        int input;

        System.out.println("I'm thinking of a number between 1 and 100\n" + "(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        input = in.nextInt();

        System.out.println("Your guess is: " + input);
        if (input == answer) {
            System.out.println("Bingo! The number I was thinking of is: " + answer);
            return;
        }
        else {
            if (input > answer) {
                System.out.println("Too high!");
            }
            else {
                System.out.println("Too low!");
            }
            System.out.println("Try again: ");
            input = in.nextInt();
            if (input == answer) {
                System.out.println("Bingo! The number I was thinking of is: " + answer);
            }
            else {
                if (input > answer) {
                    System.out.println("Too high!");
                }
                else {
                    System.out.println("Too low!");
                }
                System.out.println("Final try man, you can do it: ");
                input = in.nextInt();
                if (input == answer) {
                    System.out.println("Bingo! The number I was thinking of is: " + answer);
                }
                else {
                    System.out.println("The number I was thinking of is: " + answer);
                    System.out.println("You were off by: " + Math.abs(answer - input));
                }
            }
        }
    }
}