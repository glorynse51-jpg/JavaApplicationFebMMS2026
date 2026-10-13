import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        if (num1 > num2) System.out.printf("%d is larger%n", num1);
        if (num2 > num1) System.out.printf("%d is larger%n", num2);
        if (num1 == num2) System.out.println("These numbers are equal");
    }
}