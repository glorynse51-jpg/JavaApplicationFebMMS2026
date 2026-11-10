import java.util.Scanner;
public class GlobalWarmingQuiz {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int correct = 0;
    // Ask 5 questions, each 1-4. If answer correct, correct++
    // Example:
    System.out.println("1. Which gas is main cause...? 1.CO2 2.Oxygen 3.Nitrogen 4.Helium");
    if (input.nextInt() == 1) correct++;
    // ... repeat for Q2-Q5

    System.out.println("You got " + correct + " correct");
    if (correct == 5) System.out.println("Excellent");
    else if (correct == 4) System.out.println("Very good");
    else {
      System.out.println("Time to brush up on your knowledge of global warming");
      System.out.println("Check: ipcc.ch, nasa.gov/climate, skepticalscience.com");
    }
  }
}