import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter weight in pounds: ");
        int weight = input.nextInt();
		
        System.out.print("Enter height in inches: ");
        int height = input.nextInt();
		
        int bmi = (weight * 703) / (height * height);
        System.out.printf("BMI is %d%n%n", bmi);
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");
    }
}