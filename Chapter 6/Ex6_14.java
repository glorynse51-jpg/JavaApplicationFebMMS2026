// File: Ex6_14.java
public class Ex6_14 {
    public static int product(int... numbers) {
        int result = 1;
        for (int n : numbers) result *= n;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(product(2, 3, 4)); // 24
        System.out.println(product(5, 5)); // 25
        System.out.println(product()); // 1
    }
}