import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();
            if (guess < numberToGuess) System.out.println("Too low");
            else if (guess > numberToGuess) System.out.println("Too high");
            else System.out.println("Correct!");
        } while (guess != numberToGuess);
    }
}