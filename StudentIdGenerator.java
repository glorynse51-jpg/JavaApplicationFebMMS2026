import java.util.Random;

public class StudentIdGenerator {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate a random number from 10000 to 99999 (5 digits)
        int number = 10000 + rand.nextInt(90000);

        String studentId = "STU" + number;

        System.out.println("Generated Student ID: " + studentId);
    }
}