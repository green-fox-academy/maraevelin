import java.util.ArrayList;
import java.util.List;

public class Hand {

  Deck deck;
  List<Card> handOne;
  List<Card> handTwo;

  public Hand() {
    deck = new Deck();

    handOne = new ArrayList<>();
    getHandOne(deck.getDeck());

    handTwo = new ArrayList<>();
    getHandTwo(deck.getDeck());
  }

  private void getHandOne(List<Card> deck) {
    while (handOne.size() != 5) {
      int randomCardIndex = (int)(Math.random() * deck.size());
      if (!handOne.contains(deck.get(randomCardIndex))) {
        handOne.add(deck.get(randomCardIndex));
      }
    }
  }

  private void getHandTwo(List<Card> deck) {
    while (handTwo.size() != 5) {
      int randomCardIndex = (int)(Math.random() * deck.size());
      if (!handOne.contains(deck.get(randomCardIndex)) && !handTwo.contains(deck.get(randomCardIndex))) {
        handTwo.add(deck.get(randomCardIndex));
      }
    }
  }

  public List<Card> getHandOne() {
    return handOne;
  }

  public void setHandOne(List<Card> handOne) {
    this.handOne = handOne;
  }

  public List<Card> getHandTwo() {
    return handTwo;
  }

  public void setHandTwo(List<Card> handTwo) {
    this.handTwo = handTwo;
  }
}