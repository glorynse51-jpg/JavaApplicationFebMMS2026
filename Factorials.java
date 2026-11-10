public class Factorials {
  public static void main(String[] args) {
    System.out.println("n\t n!");
    long factorial = 1;
    for (int n = 1; n <= 20; n++) {
      factorial *= n;
      System.out.println(n + "\t" + factorial);
    }
  }
}