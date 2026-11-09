import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        // ===== EXERCISE 1: ONE HAND =====
        System.out.println("\n=== EXERCISE 1: ONE HAND ===");
        Card[] hand = new Card[5];
        for (int i = 0; i < 5; i++) {
            hand[i] = deck.dealCard();
            System.out.println(hand[i]);
        }
        System.out.println("Pair? " + deck.hasPair(hand));
        System.out.println("Two Pairs? " + deck.hasTwoPairs(hand));
        System.out.println("Three of a Kind? " + deck.hasThreeOfAKind(hand));
        System.out.println("Four of a Kind? " + deck.hasFourOfAKind(hand));
        System.out.println("Flush? " + deck.hasFlush(hand));
        System.out.println("Straight? " + deck.hasStraight(hand));
        System.out.println("Full House? " + deck.hasFullHouse(hand));

        // ===== EXERCISE 2: TWO HANDS, WHO WINS =====
        System.out.println("\n=== EXERCISE 2: TWO HANDS ===");
        deck.shuffle();
        Card[] hand1 = new Card[5];
        Card[] hand2 = new Card[5];
        for (int i = 0; i < 5; i++) {
            hand1[i] = deck.dealCard();
            hand2[i] = deck.dealCard();
        }
        System.out.println("Hand 1:");
        for (Card c : hand1) System.out.println(c);
        System.out.println("Hand 2:");
        for (Card c : hand2) System.out.println(c);

        int rank1 = deck.evaluateHand(hand1);
        int rank2 = deck.evaluateHand(hand2);
        System.out.println("Hand 1: " + deck.getHandName(rank1));
        System.out.println("Hand 2: " + deck.getHandName(rank2));
        if (rank1 > rank2) System.out.println("Hand 1 wins!");
        else if (rank2 > rank1) System.out.println("Hand 2 wins!");
        else System.out.println("Tie!");

        // ===== EXERCISE 3: REPLACE CARDS =====
        System.out.println("\n=== EXERCISE 3: REPLACE CARDS ===");
        deck.shuffle();
        Card[] playerHand = new Card[5];
        for (int i = 0; i < 5; i++) {
            playerHand[i] = deck.dealCard();
        }
        System.out.println("Your hand:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " + playerHand[i]);
        }

        System.out.print("Enter positions to replace (e.g. 1 3) or -1 to keep all: ");
        String line = "";
        while (line.isEmpty()) {
            line = input.nextLine().trim();
        }
        if (!line.equals("-1")) {
            String[] parts = line.split("\\s+");
            for (String p : parts) {
                if (p.isEmpty()) continue;
                int idx = Integer.parseInt(p);
                if (idx >= 0 && idx < 5) {
                    playerHand[idx] = deck.dealCard();
                }
            }
        }
        System.out.println("Your new hand:");
        for (Card c : playerHand) System.out.println(c);
        int newRank = deck.evaluateHand(playerHand);
        System.out.println("New Hand: " + deck.getHandName(newRank));

        // ===== EXERCISE 4: PLAYER vs DEALER =====
        System.out.println("\n=== EXERCISE 4: PLAYER vs DEALER ===");
        deck.shuffle();
        Card[] playerHand2 = new Card[5];
        Card[] dealerHand = new Card[5];
        for (int i = 0; i < 5; i++) {
            playerHand2[i] = deck.dealCard();
            dealerHand[i] = deck.dealCard();
        }
        System.out.println("Your hand:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " + playerHand2[i]);
        }
        System.out.print("Enter positions to replace (e.g. 1 3) or -1 to keep all: ");
        String line2 = "";
        while (line2.isEmpty()) {
            line2 = input.nextLine().trim();
        }
        if (!line2.equals("-1")) {
            String[] parts = line2.split("\\s+");
            for (String p : parts) {
                if (p.isEmpty()) continue;
                int idx = Integer.parseInt(p);
                if (idx >= 0 && idx < 5) {
                    playerHand2[idx] = deck.dealCard();
                }
            }
        }
        System.out.println("Your final hand:");
        for (Card c : playerHand2) System.out.println(c);
        System.out.println("Dealer hand:");
        for (Card c : dealerHand) System.out.println(c);

        int playerRank = deck.evaluateHand(playerHand2);
        int dealerRank = deck.evaluateHand(dealerHand);
        System.out.println("You: " + deck.getHandName(playerRank));
        System.out.println("Dealer: " + deck.getHandName(dealerRank));
        if (playerRank > dealerRank) System.out.println("You win!");
        else if (dealerRank > playerRank) System.out.println("Dealer wins!");
        else System.out.println("Tie!");

        input.close();
    }
}