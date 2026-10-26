import java.util.Scanner;
public class TwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        int counter = 1;
        while (counter <=10) {
            System.out.print("Enter number: ");
            int num = input.nextInt();
            if (num > largest) { second = largest; largest = num; }
            else if (num > second) { second = num; }
            counter++;
        }
        System.out.println("Largest: "+largest+" Second: "+second);
    }
}