import java.util.Scanner;
public class CreditLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account number (-1 to quit): ");
        int acc = input.nextInt();
        while (acc != -1) {
            System.out.print("Beginning balance: "); int bal = input.nextInt();
            System.out.print("Total charges: "); int charges = input.nextInt();
            System.out.print("Total credits: "); int credits = input.nextInt();
            System.out.print("Credit limit: "); int limit = input.nextInt();
            
            int newBal = bal + charges - credits;
            System.out.println("New balance: " + newBal);
            if (newBal > limit) System.out.println("Credit limit exceeded");
            
            System.out.print("\nEnter account number (-1 to quit): ");
            acc = input.nextInt();
        }
    }
}