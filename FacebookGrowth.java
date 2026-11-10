public class FacebookGrowth {
  public static void main(String[] args) {
    double users = 1_000_000_000;
    int months = 0;
    while (users < 1_500_000_000) {
      users *= 1.04;
      months++;
    }
    System.out.println("Months to 1.5B: " + months);

    users = 1_000_000_000; months = 0;
    while (users < 2_000_000_000) {
      users *= 1.04;
      months++;
    }
    System.out.println("Months to 2B: " + months);
    // Answer: ~11 months to 1.5B, ~18 months to 2B
  }
}