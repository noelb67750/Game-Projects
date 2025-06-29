import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100!");

        while (guess != target) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println(guess + " is too low.");
            } else if (guess > target) {
                System.out.println(guess + " is too high.");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " tries!");
            }
        }

        input.close();
    }
}
