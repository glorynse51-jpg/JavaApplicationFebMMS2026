import java.util.Scanner;
public class CarPool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Total miles driven per day: ");
        int miles = input.nextInt();
		
        System.out.print("Cost per gallon of gasoline (in cents): ");
        int costPerGallon = input.nextInt();
		
        System.out.print("Average miles per gallon: ");
        int mpg = input.nextInt();
		
        System.out.print("Parking fees per day (in cents): ");
        int parking = input.nextInt();
		
        System.out.print("Tolls per day (in cents): ");
        int tolls = input.nextInt();
		
        int dailyCost = (miles / mpg * costPerGallon) + parking + tolls;
        System.out.printf("Your daily driving cost is %d cents%n", dailyCost);
    }
}