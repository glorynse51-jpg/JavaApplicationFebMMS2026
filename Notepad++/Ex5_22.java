// File: Ex5_22.java
import java.util.Scanner;
public class Ex5_22 {
    public static int celsius(int f) { return (int)(5.0/9.0 * (f - 32)); }
    public static int fahrenheit(int c) { return (int)(9.0/5.0 * c + 32); }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1=F to C, 2=C to F: ");
        int choice = input.nextInt();
        System.out.print("Enter temp: ");
        int t = input.nextInt();
        if (choice == 1) System.out.println(t + "F = " + celsius(t) + "C");
        else System.out.println(t + "C = " + fahrenheit(t) + "F");
        input.close();
    }
}