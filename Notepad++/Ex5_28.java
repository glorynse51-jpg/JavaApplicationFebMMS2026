// File: Ex5_28.java
import java.util.Scanner;
public class Ex5_28 {
    public static int qualityPoints(int avg) {
        if (avg >= 90) return 4;
        if (avg >= 80) return 3;
        if (avg >= 70) return 2;
        if (avg >= 60) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter average: ");
        System.out.println("Quality Points: " + qualityPoints(input.nextInt()));
        input.close();
    }
}