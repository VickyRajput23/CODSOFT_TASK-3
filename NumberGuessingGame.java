import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();

        Scanner sc = new Scanner(System.in);

        int randomnumber = rand.nextInt(100) + 1;
        int tryCount = 0;
        while (true) {
            System.out.println("Enter Your Guess (1-100):");
            int playerGuess = sc.nextInt();
            tryCount++;
            if (playerGuess == randomnumber) {
                System.out.println("Correct! You Win!! ");
                System.out.println("It took you " + tryCount + " tries");
                break;
            } else if (playerGuess > randomnumber) {
                System.err.println("Not Correct! The number is lower, Guess again");
            } else {
                System.out.println("No! The number is higher, Guess again");
            }

        }

        sc.close();
    }

}
