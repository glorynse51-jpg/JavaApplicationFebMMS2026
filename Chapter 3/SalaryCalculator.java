import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i=1; i<=3; i++) {
            System.out.print("Enter hours for employee "+i+": ");
            double hours = input.nextDouble();
            System.out.print("Enter rate: ");
            double rate = input.nextDouble();
            double pay = (hours <= 40) ? hours * rate : 40*rate + (hours-40)*rate*1.5;
            System.out.printf("Gross pay: $%.2f%n%n", pay);
        }
    }
}