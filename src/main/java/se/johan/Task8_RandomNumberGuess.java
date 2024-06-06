package se.johan;

import java.util.Random;
import java.util.Scanner;

public class Task8_RandomNumberGuess {
    public static void main(String[] args) {
        // This program generates a random number between 1 and 500.
        // It will then let you guess what number it is, and tell you
        // if your guess is lower or higher than the generated number.
        // It will keep on going until you guess the correct number.

        //Adding Random class to generate a random number
        Random randomNumber = new Random();

        // Generate a random number between 1 and 500
        int randomNumber1 = randomNumber.nextInt(499);

        //  print the random number for reference while making the code
        // System.out.println(randomNumber1);

        // Adding Scanner to take the guess as input
        Scanner input = new Scanner(System.in);

        System.out.println("A number between 1 and 500 has been generated!");
        System.out.println("Make a guess what number it is: ");

        // Counter for attempts
        int attempts = 0;

        while (true) {
            int guess = input.nextInt();

            // Adding +1 attempts to attempts value for every loop
            attempts += 1;

            // if the guess is correct, congratulate and end program
            if (guess == randomNumber1) {
                System.out.println("Correct!");
                System.out.println("You got there in " +attempts +" guesses!");
                System.exit(0);
            }
            // if the guess is >= (smaller) inform user and run again
            if (guess >= randomNumber1) {
                System.out.println("The number is smaller, guess again!");
            }
            // if the guess is <= (larger) inform user and run again
            if (guess <= randomNumber1) {
                System.out.println("The number is larger, guess again!");
            }

        }

    }
}
