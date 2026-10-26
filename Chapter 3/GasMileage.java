import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles, gallons;
        int totalMiles = 0, totalGallons = 0;
        
        System.out.print("Enter miles driven (-1 to quit): ");
        miles = input.nextInt();
        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();
            
            double mpg = (double) miles / gallons;
            System.out.printf("MPG for this trip: %.2f%n", mpg);
            
            totalMiles += miles;
            totalGallons += gallons;
            if (totalGallons != 0) {
                System.out.printf("Combined MPG: %.2f%n", (double) totalMiles / totalGallons);
            }
            System.out.print("\nEnter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }
    }
}