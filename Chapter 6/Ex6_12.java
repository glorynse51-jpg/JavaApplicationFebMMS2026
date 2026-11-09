// File: Ex6_12.java
import java.util.Scanner;
public class Ex6_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] unique = new int[5];
        int count = 0;

        System.out.println("Enter 5 numbers between 10 and 100:");
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            boolean duplicate = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == num) { duplicate = true; break; }
            }
            if (!duplicate) {
                unique[count++] = num;
                for (int j = 0; j < count; j++) System.out.print(unique[j] + " ");
                System.out.println();
            } else {
                System.out.println("Duplicate! Not added.");
            }
        }
        input.close();
    }
}