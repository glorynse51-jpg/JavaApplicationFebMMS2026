// File: Ex5_25.java
public class Ex5_25 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 10000; i++) if (isPrime(i)) { System.out.print(i + " "); count++; }
        System.out.println("\nTotal primes: " + count);
    }
}