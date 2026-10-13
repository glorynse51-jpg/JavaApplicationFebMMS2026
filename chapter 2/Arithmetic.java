import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        System.out.printf("Sum is %d%n", num1 + num2);
        System.out.printf("Product is %d%n", num1 * num2);
        System.out.printf("Difference is %d%n", num1 - num2);
        System.out.printf("Quotient is %d%n", num1 / num2);
    }
}