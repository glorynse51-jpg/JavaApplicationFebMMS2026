// File: Ex5_30.java
import java.util.Scanner;
import java.security.SecureRandom;
public class Ex5_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom r = new SecureRandom();
        while (true) {
            int secret = 1 + r.nextInt(1000);
            int guesses = 0;
            System.out.println("Guess a number between 1 and 1000");
            while (true) {
                int guess = input.nextInt(); guesses++;
                if (guess == secret) {
                    System.out.println("Congratulations. You guessed the number!");
                    if (guesses <= 10) {
                        if (guesses == 10) System.out.println("Aha! You know the secret!");
                        else System.out.println("Either you know the secret or you got lucky!");
                    } else System.out.println("You should be able to do better!");
                    break;
                } else if (guess < secret) System.out.println("Too low. Try again.");
                else System.out.println("Too high. Try again.");
            }
            System.out.print("Play again? (1=Yes, 2=No): ");
            if (input.nextInt() == 2) break;
        }
        input.close();
    }
}