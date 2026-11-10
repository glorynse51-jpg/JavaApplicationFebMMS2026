import java.util.Scanner;

public class Smallest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of values: ");
    int count = input.nextInt();

    System.out.print("Enter value 1: ");
    int smallest = input.nextInt();

    for (int i = 2; i <= count; i++) {
      System.out.print("Enter value " + i + ": ");
      int value = input.nextInt();
      if (value < smallest)
        smallest = value;
    }
    System.out.println("Smallest value is: " + smallest);
  }
}