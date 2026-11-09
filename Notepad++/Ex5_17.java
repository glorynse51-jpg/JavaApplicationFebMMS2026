// File: Ex5_17.java
import java.util.Scanner;
public class Ex5_17 {
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number (-1 to quit): ");
        while (true) {
            int n = input.nextInt();
            if (n == -1) break;
            System.out.println(n + (isEven(n) ? " is even" : " is odd"));
        }
        input.close();
    }
}