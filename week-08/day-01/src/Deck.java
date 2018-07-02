import java.util.ArrayList;
import java.util.List;

public class Deck {

  private List<Card> deck;

  public Deck() {
    deck = new ArrayList<>();
    deck.add(new Card("Hearts", 2));
    deck.add(new Card("Hearts", 3));
    deck.add(new Card("Hearts", 4));
    deck.add(new Card("Hearts", 5));
    deck.add(new Card("Hearts", 6));
    deck.add(new Card("Hearts", 7));
    deck.add(new Card("Hearts", 8));
    deck.add(new Card("Hearts", 9));
    deck.add(new Card("Hearts", 10));
    deck.add(new Card("Hearts", 11, "Jack"));
    deck.add(new Card("Hearts", 12, "Queen"));
    deck.add(new Card("Hearts", 13, "King"));
    deck.add(new Card("Hearts", 14, "Ace"));

    deck.add(new Card("Diamonds", 2));
    deck.add(new Card("Diamonds", 3));
    deck.add(new Card("Diamonds", 4));
    deck.add(new Card("Diamonds", 5));
    deck.add(new Card("Diamonds", 6));
    deck.add(new Card("Diamonds", 7));
    deck.add(new Card("Diamonds", 8));
    deck.add(new Card("Diamonds", 9));
    deck.add(new Card("Diamonds", 10));
    deck.add(new Card("Diamonds", 11, "Jack"));
    deck.add(new Card("Diamonds", 12, "Queen"));
    deck.add(new Card("Diamonds", 13, "King"));
    deck.add(new Card("Diamonds", 14, "Ace"));

    deck.add(new Card("Spades", 2));
    deck.add(new Card("Spades", 3));
    deck.add(new Card("Spades", 4));
    deck.add(new Card("Spades", 5));
    deck.add(new Card("Spades", 6));
    deck.add(new Card("Spades", 7));
    deck.add(new Card("Spades", 8));
    deck.add(new Card("Spades", 9));
    deck.add(new Card("Spades", 10));
    deck.add(new Card("Spades", 11, "Jack"));
    deck.add(new Card("Spades", 12, "Queen"));
    deck.add(new Card("Spades", 13, "King"));
    deck.add(new Card("Spades", 14, "Ace"));

    deck.add(new Card("Clubs", 3));
    deck.add(new Card("Clubs", 2));
    deck.add(new Card("Clubs", 4));
    deck.add(new Card("Clubs", 5));
    deck.add(new Card("Clubs", 6));
    deck.add(new Card("Clubs", 7));
    deck.add(new Card("Clubs", 8));
    deck.add(new Card("Clubs", 9));
    deck.add(new Card("Clubs", 10));
    deck.add(new Card("Clubs", 11, "Jack"));
    deck.add(new Card("Clubs", 12, "Queen"));
    deck.add(new Card("Clubs", 13, "King"));
    deck.add(new Card("Clubs", 14, "Ace"));
  }

  public List<Card> getDeck() {
    return deck;
  }

  public void setDeck(List<Card> deck) {
    this.deck = deck;
  }
}