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

  public static void main(String[] args) {
    Hand hand = new Hand();

    for (int i = 0; i < hand.handOne.size(); i++) {
      System.out.println("handone" + i + ": " + hand.handOne.get(i).getName());
      System.out.println("handtwo" + i + ": " + hand.handTwo.get(i).getName());
    }
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

}