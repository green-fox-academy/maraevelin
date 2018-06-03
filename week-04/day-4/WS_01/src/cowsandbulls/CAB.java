package cowsandbulls;

import java.util.ArrayList;
import java.util.Scanner;

public class CAB {
  private ArrayList<Integer> beGuessed;
  protected boolean isPlaying;
  protected int guessCounter;
  protected String guessResult;
  protected ArrayList<Integer> actualGuess;

  public CAB() {
    this.beGuessed = getNumber();
    this.isPlaying = true;
    this.guessCounter = 0;
    this.guessResult = "";
    this.actualGuess = getGuess();

  }

  private ArrayList<Integer> getNumber() {
    ArrayList<Integer> fourDigitNumber = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      fourDigitNumber.add(((int) (Math.random() * 10)));
    }
    return fourDigitNumber;
  }

  public ArrayList<Integer> getGuess() {
    ArrayList<Integer> fourDigitGuess = new ArrayList<>();
    getInputForGuess(fourDigitGuess);
    return fourDigitGuess;
  }

  private void getInputForGuess(ArrayList<Integer> fourDigitGuess) {
    for (int i = 1; i <= 4; i++) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Guess the number at the " + i + ". position of the number!");
      int guess = scanner.nextInt();
      fourDigitGuess.add(guess);
    }
    increaseGuessCounter();
    giveGuessResult(beGuessed, actualGuess);
  }

  private String giveGuessResult(ArrayList<Integer> beGuessed, ArrayList<Integer> actualGuess) {
    String guessResult = "";

    for (int number:
         actualGuess) {
      if () {
        return "cow";
      } else if () {
        return "bull";
      } return "none";

    }


    return guessResult;
  }


  private void increaseGuessCounter() {
    this.guessCounter++;
  }
}