import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        // Exercise 1 - Deal 5 card hand
        System.out.println("=== EXERCISE 1: ONE HAND ===");
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

        // Exercise 2 - Two hands, who wins
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
        int rank1 = deck.evaluateHand(hand1);
        System.out.println("=> " + deck.getHandName(rank1));

        System.out.println("Hand 2:");
        for (Card c : hand2) System.out.println(c);
        int rank2 = deck.evaluateHand(hand2);
        System.out.println("=> " + deck.getHandName(rank2));

        if (rank1 > rank2) System.out.println("Hand 1 Wins!");
        else if (rank2 > rank1) System.out.println("Hand 2 Wins!");
        else System.out.println("Tie!");

        // Exercise 3 and 4 - Dealer + Player replace cards
        System.out.println("\n=== EXERCISE 3 & 4: DEALER AND PLAYER ===");
        deck.shuffle();
        Card[] playerHand = new Card[5];
        Card[] dealerHand = new Card[5];
        for (int i = 0; i < 5; i++) {
            playerHand[i] = deck.dealCard();
            dealerHand[i] = deck.dealCard();
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
                int pos = Integer.parseInt(p);
                playerHand[pos] = deck.dealCard();
            }
        }

        System.out.println("Your new hand:");
        for (Card c : playerHand) System.out.println(c);
        int playerRank = deck.evaluateHand(playerHand);
        System.out.println("=> " + deck.getHandName(playerRank));

        // Dealer: if dealer has no pair, dealer draws 3 cards
        int dealerRankBefore = deck.evaluateHand(dealerHand);
        if (dealerRankBefore == 0) {
            for (int i = 0; i < 3; i++) {
                dealerHand[i] = deck.dealCard();
            }
        }
        System.out.println("Dealer hand:");
        for (Card c : dealerHand) System.out.println(c);
        int dealerRank = deck.evaluateHand(dealerHand);
        System.out.println("=> " + deck.getHandName(dealerRank));

        if (playerRank > dealerRank) System.out.println("YOU WIN!");
        else if (dealerRank > playerRank) System.out.println("DEALER WINS!");
        else System.out.println("TIE!");
    }
}