import java.util.Scanner;
public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] prices = {239.99, 129.75, 99.95, 350.89};
        double totalSales = 0;
        System.out.print("Enter item number (1-4) (-1 to quit): ");
        int item = input.nextInt();
        while (item != -1) {
            if (item >=1 && item <=4) totalSales += prices[item-1];
            System.out.print("Enter item number (1-4) (-1 to quit): ");
            item = input.nextInt();
        }
        double earnings = 200 + 0.09 * totalSales;
        System.out.printf("Earnings: $%.2f%n", earnings);
    }
}