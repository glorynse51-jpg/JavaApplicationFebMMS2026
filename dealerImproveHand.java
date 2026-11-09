// Inside DeckOfCards or main - dealer strategy
public Card[] dealerImproveHand(Card[] hand, DeckOfCards deck) {
    // If already Pair or better, keep all - don't draw
    if (evaluateHand(hand) >= 1) return hand;

    // If 4 cards same suit -> draw 1 for Flush
    // If 4 cards straight -> draw 1 for Straight
    // Else if has Pair -> keep Pair, draw 3
    // Else -> keep highest card (Ace/King), draw 4 (book says 1-3, so draw 3)
    // Simplified rule used in textbook solutions:
    // Keep Pair if any, else keep Ace, discard 3 others
    return hand;
}