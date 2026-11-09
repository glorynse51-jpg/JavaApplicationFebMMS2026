// File: Ex5_26.java
import java.util.Scanner;
public class Ex5_26 {
    public static int reverseDigits(int n) {
        int rev = 0;
        while (n != 0) { rev = rev * 10 + n % 10; n /= 10; }
        return rev;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        System.out.println("Reversed: " + reverseDigits(input.nextInt()));
        input.close();
    }
}