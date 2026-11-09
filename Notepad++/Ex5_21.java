// File: Ex5_21.java
import java.util.Scanner;
public class Ex5_21 {
    public static int quotient(int a, int b) { return a / b; }
    public static int remainder(int a, int b) { return a % b; }
    public static void displayDigits(int n) {
        int divisor = 10000;
        for (int i = 0; i < 5; i++) {
            int digit = quotient(n, divisor);
            System.out.print(digit + "  ");
            n = remainder(n, divisor);
            divisor /= 10;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1-99999: ");
        displayDigits(input.nextInt());
        input.close();
    }
}