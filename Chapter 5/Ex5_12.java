// File: Ex5_12.java
import java.security.SecureRandom;
public class Ex5_12 {
    public static void main(String[] args) {
        SecureRandom r = new SecureRandom();
        int a = 1 + r.nextInt(2); // 1-2
        int b = 1 + r.nextInt(100); // 1-100
        int c = r.nextInt(10); // 0-9
        int d = 1000 + r.nextInt(113); // 1000-1112
        int e = -1 + r.nextInt(3); // -1 to 1
        int f = -3 + r.nextInt(15); // -3 to 11
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
    }
}