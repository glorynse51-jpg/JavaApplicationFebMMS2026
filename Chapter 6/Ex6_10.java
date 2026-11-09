// File: Ex6_10.java
public class Ex6_10 {
    public static void main(String[] args) {
        // counters for ranges: $200-299, 300-399, ..., 1000+
        int[] counts = new int[9];
        double[] sales = {300, 500, 2000, 900, 1100, 250, 4500, 800, 600};

        for (double s : sales) {
            int salary = (int)(200 + s * 0.09);
            int index = salary / 100 - 2;
            if (index > 8) index = 8;
            if (index < 0) index = 0;
            counts[index]++;
        }
        for (int i = 0; i < 9; i++) {
            if (i == 8) System.out.println("$1000 and over: " + counts[i]);
            else System.out.println("$" + (200 + i*100) + "-" + (299 + i*100) + ": " + counts[i]);
        }
    }
}