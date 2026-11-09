// File: Ex5_27.java
import java.util.Scanner;
public class Ex5_27 {
    public static int gcd(int a, int b) {
        while (b != 0) { int t = b; b = a % b; a = t; }
        return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        System.out.println("GCD: " + gcd(input.nextInt(), input.nextInt()));
        input.close();
    }
}