import java.util.Scanner;
public class CountValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negatives = 0, positives = 0, zeros = 0;
        System.out.print("Enter number 1: ");
        int n1 = input.nextInt();
        if (n1 < 0) negatives++;
        if (n1 > 0) positives++;
        if (n1 == 0) zeros++;
		
        System.out.print("Enter number 2: ");
        int n2 = input.nextInt();
        if (n2 < 0) negatives++;
        if (n2 > 0) positives++;
        if (n2 == 0) zeros++;
		
        System.out.print("Enter number 3: ");
        int n3 = input.nextInt();
        if (n3 < 0) negatives++;
        if (n3 > 0) positives++;
        if (n3 == 0) zeros++;
		
        System.out.print("Enter number 4: ");
        int n4 = input.nextInt();
        if (n4 < 0) negatives++;
        if (n4 > 0) positives++;
        if (n4 == 0) zeros++;
		
        System.out.print("Enter number 5: ");
        int n5 = input.nextInt();
        if (n5 < 0) negatives++;
        if (n5 > 0) positives++;
        if (n5 == 0) zeros++;
        System.out.printf("Negatives: %d%nPositives: %d%nZeros: %d%n", negatives, positives, zeros);
    }
}