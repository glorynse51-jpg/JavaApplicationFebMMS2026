// File: Ex5_15.java
import java.util.Scanner;
public class Ex5_15 {
    public static double hypotenuse(double s1, double s2) {
        return Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side1 side2: ");
        System.out.println("Hypotenuse: " + hypotenuse(input.nextDouble(), input.nextDouble()));
        System.out.println("3,4 -> " + hypotenuse(3, 4));
        System.out.println("5,12 -> " + hypotenuse(5, 12));
        System.out.println("8,15 -> " + hypotenuse(8, 15));
        input.close();
    }
}