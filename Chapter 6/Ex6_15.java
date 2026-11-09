// File: Ex6_15.java
public class Ex6_15 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments. Run: java Ex6_15 10 20 30");
            return;
        }
        int sum = 0;
        for (String a : args) sum += Integer.parseInt(a);
        System.out.println("Sum = " + sum);
    }
}