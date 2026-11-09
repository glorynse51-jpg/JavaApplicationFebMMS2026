// Ex5_33.java
import java.util.Scanner;
import java.security.SecureRandom;
public class Ex5_33 {
    static SecureRandom r = new SecureRandom();
    public static int rollDice() {
        int d1 = 1 + r.nextInt(6), d2 = 1 + r.nextInt(6);
        System.out.println("Rolled " + d1 + " + " + d2 + " = " + (d1+d2));
        return d1 + d2;
    }
    public static void chatter() {
        String[] msgs = {"Oh, you're going for broke, huh?", "Aw c'mon, take a chance!", "You're up big. Now's the time to cash in your chips!"};
        System.out.println(msgs[r.nextInt(msgs.length)]);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bankBalance = 1000;
        while (bankBalance > 0) {
            System.out.print("Bank: $" + bankBalance + " Enter wager (0 to quit): ");
            int wager = input.nextInt();
            if (wager == 0) break;
            while (wager > bankBalance) { System.out.print("Too high! Re-enter: "); wager = input.nextInt(); }
            chatter();
            int sum = rollDice();
            boolean win;
            if (sum == 7 || sum == 11) win = true;
            else if (sum == 2 || sum == 3 || sum == 12) win = false;
            else {
                int point = sum;
                while (true) {
                    sum = rollDice();
                    if (sum == point) { win = true; break; }
                    if (sum == 7) { win = false; break; }
                }
            }
            if (win) { bankBalance += wager; System.out.println("You win!"); }
            else { bankBalance -= wager; System.out.println("You lose!"); }
            System.out.println("New Balance: $" + bankBalance);
            if (bankBalance == 0) System.out.println("Sorry. You busted!");
        }
        input.close();
    }
}