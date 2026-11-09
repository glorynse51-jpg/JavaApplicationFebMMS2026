// File: Ex5_09.java
import java.util.Scanner;
public class Ex5_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        double x = input.nextDouble();
        double y = Math.floor(x + 0.5);
        System.out.println("Original: " + x + " Rounded: " + y);
        input.close();
    }
}