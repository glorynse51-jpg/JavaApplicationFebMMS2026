// File: Ex5_13.java
import java.security.SecureRandom;
public class Ex5_13 {
    public static void main(String[] args) {
        SecureRandom r = new SecureRandom();
        System.out.println(2 + 2 * r.nextInt(5)); // 2,4,6,8,10
        System.out.println(3 + 2 * r.nextInt(5)); // 3,5,7,9,11
        System.out.println(6 + 4 * r.nextInt(5)); // 6,10,14,18,22
    }
}