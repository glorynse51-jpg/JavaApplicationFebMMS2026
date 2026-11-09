// Ex5_35.java
import java.util.Scanner;
import java.security.SecureRandom;
public class Ex5_35 {
    static SecureRandom r = new SecureRandom();
    static Scanner input = new Scanner(System.in);
    public static void correctResponse() {
        String[] msgs = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};
        System.out.println(msgs[r.nextInt(4)]);
    }
    public static void wrongResponse() {
        String[] msgs = {"No. Please try again.", "Wrong. Try once more.", "Don't give up!", "No. Keep trying."};
        System.out.println(msgs[r.nextInt(4)]);
    }
    public static int generateQuestion(int level, int type) {
        int max = (int)Math.pow(10, level) - 1;
        int n1 = r.nextInt(max) + 1, n2 = r.nextInt(max) + 1;
        int op = type;
        if (type == 5) op = 1 + r.nextInt(4);
        int answer = 0;
        switch (op) {
            case 1: System.out.print("How much is " + n1 + " plus " + n2 + "? "); answer = n1 + n2; break;
            case 2: System.out.print("How much is " + n1 + " minus " + n2 + "? "); answer = n1 - n2; break;
            case 3: System.out.print("How much is " + n1 + " times " + n2 + "? "); answer = n1 * n2; break;
            case 4: answer = n1; n1 = n1 * n2; System.out.print("How much is " + n1 + " divided by " + n2 + "? "); break;
        }
        return answer;
    }
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter difficulty (1-3, 0 to quit): ");
            int level = input.nextInt();
            if (level == 0) break;
            System.out.print("Type: 1=Add 2=Sub 3=Mul 4=Div 5=Mix: ");
            int type = input.nextInt();
            int correct = 0;
            for (int i = 0; i < 10; i++) {
                int answer = generateQuestion(level, type);
                int student = input.nextInt();
                while (student != answer) {
                    wrongResponse();
                    System.out.print("Try again: ");
                    student = input.nextInt();
                }
                correctResponse();
                correct++;
            }
            double percent = correct * 100.0 / 10;
            System.out.println("Score: " + percent + "%");
            if (percent < 75) System.out.println("Please ask your teacher for extra help.");
            else System.out.println("Congratulations, you are ready to go to the next level!");
        }
        input.close();
    }
}