// File: Ex5_29.java
import java.util.Scanner;
import java.security.SecureRandom;
public class Ex5_29 {
    enum Coin { HEADS, TAILS }
    static SecureRandom r = new SecureRandom();
    public static Coin flip() { return r.nextBoolean() ? Coin.HEADS : Coin.TAILS; }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heads = 0, tails = 0;
        while (true) {
            System.out.print("1=Toss, 2=Quit: ");
            if (input.nextInt() == 2) break;
            Coin c = flip();
            System.out.println(c);
            if (c == Coin.HEADS) heads++; else tails++;
            System.out.println("Heads: " + heads + " Tails: " + tails);
        }
        input.close();
    }
}