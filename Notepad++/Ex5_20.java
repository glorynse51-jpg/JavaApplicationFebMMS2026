// File: Ex5_20.java
import java.util.Scanner;
public class Ex5_20 {
    public static double circleArea(double r) { return Math.PI * r * r; }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        System.out.println("Area: " + circleArea(input.nextDouble()));
        input.close();
    }
}