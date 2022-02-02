package ElementaryProblems;

import java.util.Scanner;

public class GuessGame
{
    public static void main(String[] args)
    {
        int secretNumber = 61;
        int tries = 0;
        int guess = 0;
        int previousGuess = 0;

        Scanner scanner = new Scanner(System.in);

        while (guess != secretNumber)
        {
            System.out.print("Enter a number [1-100]: ");
            guess = scanner.nextInt();

            if(guess != previousGuess)
                tries++;

            if(guess == secretNumber)
                System.out.println("Congratulations!");

            else if(guess > secretNumber)
                System.out.println("You lose, too high");
            else
                System.out.println("You lose, too low");

            System.out.println("Your tries: " + tries);

            previousGuess = guess;
        }
    }
}
