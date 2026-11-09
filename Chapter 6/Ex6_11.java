// File: Ex6_11.java
public class Ex6_11 {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i = 0; i < counts.length; i++) counts[i] = 0;

        double[] bonus = new double[15];
        for (int i = 0; i < bonus.length; i++) bonus[i] += 1;

        int[] bestScores = {10, 20, 30, 40, 50};
        for (int i = 0; i < bestScores.length; i++) System.out.println(bestScores[i]);
    }
}