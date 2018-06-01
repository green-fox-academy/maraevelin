package cowsandbulls;

import java.util.ArrayList;
import java.util.Scanner;

public class CAB {
  private ArrayList<Integer> randomFourDigitNumber;
  protected boolean isComplete;
  protected int guessCounter;
  protected String guessResult;
  protected ArrayList<Integer> guessNumber;

  public CAB() {
    this.randomFourDigitNumber = getNumber();
    this.isComplete = false;
    this.guessCounter = 0;
    this.guessResult = "";
    this.guessNumber = getGuess();

  }

  private ArrayList<Integer> getNumber() {
    ArrayList<Integer> fourDigit = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      fourDigit.add(((int) (Math.random() * 10)));
    }
    return fourDigit;
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
  }

  private void increaseGuessCounter() {
    this.guessCounter++;
  }
}