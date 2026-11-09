// File: Ex5_14.java
import java.util.Scanner;
public class Ex5_14 {
    public static int integerPower(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) result *= base;
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base and exponent: ");
        System.out.println(integerPower(input.nextInt(), input.nextInt()));
        input.close();
    }
}