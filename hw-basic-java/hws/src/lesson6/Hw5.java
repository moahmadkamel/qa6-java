
// import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        int answer, guess;

        Scanner in = new Scanner(System.in);

        Random rand = new Random();

        boolean correct = false;

        answer = rand.nextInt(100) + 1;
        System.out.println("Random number = " + answer);

        System.out.print("Your name: ");
        String name = in.nextLine();

        System.out.println("Let the game begin!");

        while (!correct) {
            System.out.println("I am thinking of a number from 0 to 100 ... guess what it is ? ");
            guess = in.nextInt();
            if (guess > answer) {
                System.out.println("Too high, try again");
            } else if (guess < answer) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Congratulations, " + name + "!");
                correct = true;
            }
        }
        in.close();
    }
}