public class ProductOdd {
  public static void main(String[] args) {
    int product = 1;
    for (int i = 1; i <= 15; i += 2) {
      product *= i;
    }
    System.out.println("Product of odd integers 1 to 15 = " + product);
    // 1*3*5*7*9*11*13*15 = 2027025
  }
}