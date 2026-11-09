// File: Ex5_08.java
import java.util.Scanner;
public class Ex5_08 {
    public static double calculateCharges(double hours) {
        double charge = 2.0;
        if (hours > 3) charge += 0.50 * Math.ceil(hours - 3);
        if (charge > 10.0) charge = 10.0;
        return charge;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        while (true) {
            System.out.print("Enter hours parked (-1 to quit): ");
            double h = input.nextDouble();
            if (h == -1) break;
            double c = calculateCharges(h);
            total += c;
            System.out.printf("Charge: $%.2f Total: $%.2f%n", c, total);
        }
        input.close();
    }
}