public class TwoHandsTest {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
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

        System.out.println("\nHand 2:");
        for (Card c : hand2) System.out.println(c);
        int rank2 = deck.evaluateHand(hand2);
        System.out.println("=> " + deck.getHandName(rank2));

        if (rank1 > rank2) System.out.println("\nHand 1 Wins!");
        else if (rank2 > rank1) System.out.println("\nHand 2 Wins!");
        else System.out.println("\nTie!");
    }
}