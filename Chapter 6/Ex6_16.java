// File: Ex6_16.java
public class Ex6_16 {
    public static void main(String[] args) {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;
        for (int num : array) total += num;
        System.out.println("Total = " + total);
    }
}