// File: Ex5_16.java
import java.util.Scanner;
public class Ex5_16 {
    public static boolean isMultiple(int a, int b) { return b % a == 0; }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers (-1 -1 to quit): ");
        while (true) {
            int a = input.nextInt(); int b = input.nextInt();
            if (a == -1) break;
            System.out.println(b + (isMultiple(a, b) ? " is " : " is NOT ") + "multiple of " + a);
        }
        input.close();
    }
}