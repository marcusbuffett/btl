package btl;

import btl.Strategy;
import btl.Question;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Square implements Strategy {
  public int n;
  public int mantissa;

  public Square(int n) {
    this.n = n;
  }

  public String getName() {
    return this.n + " Digit Squares";
  }

  public Question generateQuestion(long seed) {
    Random generator = new Random(seed);
    mantissa = this.generateNumber(generator);
    String question = String.format("%d ^ 2", mantissa);
    String answer = Integer.toString((int) Math.pow(mantissa, 2));
    return new Question(question, answer);
  }

  private int generateNumber(Random generator) {
    int base = (int) Math.pow(10, this.n - 1);
    return generator.nextInt(9 * base) + base;
  }
}
