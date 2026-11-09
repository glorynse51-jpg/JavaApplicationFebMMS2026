public class PokerHandTest {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        Card[] hand = new Card[5];
        for (int i = 0; i < 5; i++) {
            hand[i] = deck.dealCard();
            System.out.println(hand[i]);
        }

        System.out.println("\nPair? " + deck.hasPair(hand));
        System.out.println("Two Pairs? " + deck.hasTwoPairs(hand));
        System.out.println("Three of a Kind? " + deck.hasThreeOfAKind(hand));
        System.out.println("Four of a Kind? " + deck.hasFourOfAKind(hand));
        System.out.println("Flush? " + deck.hasFlush(hand));
        System.out.println("Straight? " + deck.hasStraight(hand));
        System.out.println("Full House? " + deck.hasFullHouse(hand));
    }
}