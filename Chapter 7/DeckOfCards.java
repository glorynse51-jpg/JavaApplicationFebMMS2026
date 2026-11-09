import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCards {
    private static final SecureRandom random = new SecureRandom();
    private Card[] deck = new Card[52];
    private int currentCard = 0;

    private static final String[] FACES = {
        "Ace", "Deuce", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"
    };
    private static final String[] SUITS = {
        "Hearts", "Diamonds", "Clubs", "Spades"
    };

    public DeckOfCards() {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(FACES[i % 13], SUITS[i / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        }
        return null;
    }

    private int[] getFaceCounts(Card[] hand) {
        int[] counts = new int[14];
        for (Card c : hand) {
            counts[c.getFaceValue()]++;
        }
        return counts;
    }

    private int countPairs(int[] counts) {
        int pairs = 0;
        for (int c : counts) {
            if (c == 2) pairs++;
        }
        return pairs;
    }

    public boolean hasPair(Card[] hand) {
        return countPairs(getFaceCounts(hand)) == 1;
    }

    public boolean hasTwoPairs(Card[] hand) {
        return countPairs(getFaceCounts(hand)) == 2;
    }

    public boolean hasThreeOfAKind(Card[] hand) {
        for (int c : getFaceCounts(hand)) {
            if (c == 3) return true;
        }
        return false;
    }

    public boolean hasFourOfAKind(Card[] hand) {
        for (int c : getFaceCounts(hand)) {
            if (c == 4) return true;
        }
        return false;
    }

    public boolean hasFlush(Card[] hand) {
        for (int i = 1; i < hand.length; i++) {
            if (!hand[i].getSuit().equals(hand[0].getSuit())) {
                return false;
            }
        }
        return true;
    }

    public boolean hasStraight(Card[] hand) {
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = hand[i].getFaceValue();
        }
        Arrays.sort(values);
        boolean normal = true;
        for (int i = 1; i < 5; i++) {
            if (values[i] != values[i - 1] + 1) normal = false;
        }
        if (normal) return true;
        return values[0] == 1 && values[1] == 10 && values[2] == 11
            && values[3] == 12 && values[4] == 13;
    }

    public boolean hasFullHouse(Card[] hand) {
        return hasThreeOfAKind(hand) && countPairs(getFaceCounts(hand)) == 1;
    }

    public int evaluateHand(Card[] hand) {
        boolean flush = hasFlush(hand);
        boolean straight = hasStraight(hand);
        if (flush && straight) return 8;
        if (hasFourOfAKind(hand)) return 7;
        if (hasFullHouse(hand)) return 6;
        if (flush) return 5;
        if (straight) return 4;
        if (hasThreeOfAKind(hand)) return 3;
        if (hasTwoPairs(hand)) return 2;
        if (hasPair(hand)) return 1;
        return 0;
    }

    public String getHandName(int rank) {
        String[] names = {"High Card", "Pair", "Two Pairs", "Three of a Kind",
            "Straight", "Flush", "Full House", "Four of a Kind", "Straight Flush"};
        return names[rank];
    }
	    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.dealCard());
        }
    }
}