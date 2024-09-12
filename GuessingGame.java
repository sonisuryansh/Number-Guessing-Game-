import java.util.Scanner;
import java.util.Random;

        public class GuessingGame {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                int maxAttempts = 5;
                int score = 0;
                boolean playAgain = true;

                while (playAgain) {
                    int targetNumber = random.nextInt(100) + 1; // Random No;
                    int attempts = 0;
                    boolean hasGuessedCorrectly = false;

                    System.out.println("Welcome to the Guessing Game!");
                    System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");

                    while (attempts < maxAttempts && !hasGuessedCorrectly) {
                        System.out.print("Enter your guess: ");
                        int userGuess = scanner.nextInt();
                        attempts++;

                        if (userGuess == targetNumber) {
                            System.out.println("Congratulations! You've guessed the correct number.");
                            score += (maxAttempts - attempts + 1); // Increase score
                            hasGuessedCorrectly = true;
                        } else if (userGuess > targetNumber) {
                            System.out.println("Too high!");
                        } else {
                            System.out.println("Too low!");
                        }
                        if (attempts == maxAttempts && !hasGuessedCorrectly) {
                            System.out.println("Sorry, you've used all your attempts. The correct number was " + targetNumber);
                        }
                    }
                    System.out.println("Your current score is: " + score);
                    System.out.print("Do you want to play again? (yes/no): ");
                    playAgain = scanner.next().equalsIgnoreCase("yes");
                }

                System.out.println("Thank you for playing! Your final score is: " + score);
                scanner.close();
            }
        }