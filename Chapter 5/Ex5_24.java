// File: Ex5_24.java
public class Ex5_24 {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum == n;
    }
    public static void main(String[] args) {
        for (int n = 1; n <= 1000; n++) {
            if (isPerfect(n)) {
                System.out.print(n + " = ");
                for (int i = 1; i < n; i++) if (n % i == 0) System.out.print(i + " + ");
                System.out.println();
            }
        }
    }
}