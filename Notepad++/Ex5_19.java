// File: Ex5_19.java
import java.util.Scanner;
public class Ex5_19 {
    public static void squareOfAsterisks(int side, char fill) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) System.out.print(fill);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side and character: ");
        squareOfAsterisks(input.nextInt(), input.next().charAt(0));
        input.close();
    }
}