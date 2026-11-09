import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.print("Enter card positions to replace (0-4, e.g. 1 3) or -1 to keep: ");
String line = input.nextLine();
if (!line.equals("-1")) {
    for (String s : line.split(" ")) {
        int idx = Integer.parseInt(s);
        hand[idx] = deck.dealCard(); // replace
    }
}
int newRank = deck.evaluateHand(hand);
System.out.println("New Hand: " + deck.getHandName(newRank));