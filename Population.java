import java.util.Scanner;
public class Population {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter current world population: ");
        long pop = input.nextLong();
		
        System.out.print("Enter annual growth rate (as percent, e.g. 1): ");
        int rate = input.nextInt();
		
        System.out.printf("After 1 year: %d%n", pop + pop * rate / 100);
        pop = pop + pop * rate / 100;
        System.out.printf("After 2 years: %d%n", pop + pop * rate / 100);
        pop = pop + pop * rate / 100;
        System.out.printf("After 3 years: %d%n", pop + pop * rate / 100);
        pop = pop + pop * rate / 100;
        System.out.printf("After 4 years: %d%n", pop + pop * rate / 100);
        pop = pop + pop * rate / 100;
        System.out.printf("After 5 years: %d%n", pop + pop * rate / 100);
    }
}