import java.util.Scanner;
public class FairTax {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double total = 0;
    String[] categories = {"Housing","Food","Clothing","Transportation","Education","Health care","Vacations"};
    for (String cat : categories) {
      System.out.print("Enter expense for " + cat + ": ");
      total += input.nextDouble();
    }
    double fairTax = total * 0.23;
    System.out.println("Total expenses: " + total);
    System.out.println("Estimated FairTax (23%): " + fairTax);
  }
}