public class StudentResult {

    // 1. One integer score
    public void calculateResult(int score) {
        System.out.println("Single Score: " + score);
    }

    // 2. Two integer scores - average
    public void calculateResult(int score1, int score2) {
        double average = (score1 + score2) / 2.0;
        System.out.println("Average of Two Scores: " + average);
    }

    // 3. Three integer scores - average
    public void calculateResult(int score1, int score2, int score3) {
        double average = (score1 + score2 + score3) / 3.0;
        System.out.println("Average of Three Scores: " + average);
    }

    // 4. Two decimal scores - average
    public void calculateResult(double score1, double score2) {
        double average = (score1 + score2) / 2.0;
        System.out.println("Average of Two Decimal Scores: " + average);
    }

    public static void main(String[] args) {
        StudentResult student = new StudentResult();

        student.calculateResult(80);          // Single
        student.calculateResult(70, 80);       // Two ints -> 75.0
        student.calculateResult(70, 80, 90);   // Three ints -> 80.0
        student.calculateResult(80.5, 90.0);   // Two doubles -> 85.25
    }
}