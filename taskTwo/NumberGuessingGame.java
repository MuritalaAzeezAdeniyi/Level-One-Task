package taskTwo;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;


        int guess = 0;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a random number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");


        while (guess != numberToGuess && attempts < maxAttempts) {
            System.out.print("Enter your guess: ");

            try {
                guess = scanner.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");

                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");

                } else {
                    System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
                    break;
                }


                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + numberToGuess + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
