import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomizer = new Random();


        //Store randomly generated number in randomNum
        int randomNum = randomizer.nextInt(10) + 1;
        int userGuess;

        //Print prompt to user

        System.out.println("I am thinking about a number between 1 and 10...");
        System.out.println("Can you guess it?");


        do {
            //Ask for user input inside loop
            userGuess = input.nextInt();

            //Give user feedback based on input
            if (userGuess < randomNum){
                System.out.println("It's too low. Guess again");
            } else if (userGuess > randomNum){
                System.out.println("It's too high. Guess again");
            }

        } while (userGuess != randomNum);
        //Repeat loop until userGuess is not equal to randomNum

        System.out.println("That's right! You are a good guesser.");
    }
}


