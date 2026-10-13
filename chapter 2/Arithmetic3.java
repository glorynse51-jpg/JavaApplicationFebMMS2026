import java.util.Scanner;
public class Arithmetic3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
		
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
		
        System.out.print("Enter third integer: ");
        int n3 = input.nextInt();
		
        int sum = n1 + n2 + n3;
        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Average is %d%n", sum / 3);
        System.out.printf("Product is %d%n", n1 * n2 * n3);
		
        int smallest = n1;
        if (n2 < smallest) smallest = n2;
        if (n3 < smallest) smallest = n3;
		
        int largest = n1;
        if (n2 > largest) largest = n2;
        if (n3 > largest) largest = n3;
        System.out.printf("Smallest is %d%n", smallest);
        System.out.printf("Largest is %d%n", largest);
    }
}

