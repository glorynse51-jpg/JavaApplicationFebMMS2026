import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        if (n1 % n2 == 0) System.out.printf("%d is a multiple of %d%n", n1, n2);
        if (n1 % n2 != 0) System.out.printf("%d is not a multiple of %d%n", n1, n2);
    }
}