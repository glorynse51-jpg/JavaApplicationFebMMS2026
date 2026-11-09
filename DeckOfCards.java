import java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck = new Card[52];
    private int currentCard = 0;
    private static final SecureRandom random = new SecureRandom();

    // Constructor — THIS NA THE PART FOR YOUR PICTURE
    public DeckOfCards() {
        Face[] faces = Face.values();
        Suit[] suits = Suit.values();
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int i = 0; i < deck.length; i++) {
            int j = random.nextInt(52);
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

    // Helpers for checking hand
    private int[] countFaces(Card[] hand) {
        int[] counts = new int[13];
        for (Card c : hand) {
            counts[c.getFace().ordinal()]++;
        }
        return counts;
    }

    public boolean hasPair(Card[] hand) {
        for (int n : countFaces(hand)) if (n == 2) return true;
        return false;
    }

    public boolean hasTwoPairs(Card[] hand) {
        int pairs = 0;
        for (int n : countFaces(hand)) if (n == 2) pairs++;
        return pairs == 2;
    }

    public boolean hasThreeOfAKind(Card[] hand) {
        for (int n : countFaces(hand)) if (n == 3) return true;
        return false;
    }

    public boolean hasFourOfAKind(Card[] hand) {
        for (int n : countFaces(hand)) if (n == 4) return true;
        return false;
    }

    public boolean hasFlush(Card[] hand) {
        Suit s = hand[0].getSuit();
        for (Card c : hand) if (c.getSuit() != s) return false;
        return true;
    }

    public boolean hasStraight(Card[] hand) {
        int[] counts = countFaces(hand);
        // Simple straight check: 5 consecutive faces
        for (int i = 0; i <= 8; i++) {
            boolean ok = true;
            for (int j = 0; j < 5; j++) if (counts[i + j] == 0) ok = false;
            if (ok) return true;
        }
        // Ace-low: A,2,3,4,5 and Ace-high: 10,J,Q,K,A
        if (counts[0] > 0 && counts[1] > 0 && counts[2] > 0 && counts[3] > 0 && counts[4] > 0) return true;
        if (counts[0] > 0 && counts[9] > 0 && counts[10] > 0 && counts[11] > 0 && counts[12] > 0) return true;
        return false;
    }

    public boolean hasFullHouse(Card[] hand) {
        return hasPair(hand) && hasThreeOfAKind(hand);
    }

    public int evaluateHand(Card[] hand) {
        if (hasStraight(hand) && hasFlush(hand)) return 8;
        if (hasFourOfAKind(hand)) return 7;
        if (hasFullHouse(hand)) return 6;
        if (hasFlush(hand)) return 5;
        if (hasStraight(hand)) return 4;
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
}