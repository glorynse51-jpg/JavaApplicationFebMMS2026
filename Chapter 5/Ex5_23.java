// File: Ex5_23.java
import java.util.Scanner;
public class Ex5_23 {
    public static double minimum3(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        System.out.println("Smallest: " + minimum3(input.nextDouble(), input.nextDouble(), input.nextDouble()));
        input.close();
    }
}