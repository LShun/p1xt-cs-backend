/*
GuessStarter
Allows a user to guess a randomly generated number, return "You guessed it, damn!" if the user successfully guessed the number. Otherwise, return the actual number and how far is the user off by.
 */


import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    // Integer -> String
    public static void main(String args[]) {
        int answer, guess;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        answer = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        guess = in.nextInt();

        if (guess == answer) {
            System.out.println("You guessed it, damn!");
        }
        else {
            System.out.println("Bitch yo, dumb yo!");
            System.out.println("The correct number is: " + answer);
            System.out.println("You are away from it by: " + (answer - guess));
        }

    }
}