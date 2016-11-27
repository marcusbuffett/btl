package btl;

import btl.Strategy;
import btl.Question;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Multiplication implements Strategy {
  public int multiplier;
  public int multiplicand;
  int n;
  int m;

  public Multiplication(int n, int m) {
    this.n = n;
    this.m = m;
  }

  public String getName() {
    return this.n + " by " + this.m + " Digit Multiplication";
  }

  public Question generateQuestion(long seed) {
    Random generator = new Random(seed);
    multiplier = this.generateNumber(generator, this.n);
    multiplicand = this.generateNumber(generator, this.m);
    String question = generateQuestonRep();
    String answer = Integer.toString(multiplier * multiplicand);
    return new Question(question, answer);
  }

  private String generateQuestonRep() {
    return String.format("%d * %d", multiplier, multiplicand);
  }

  private int generateNumber(Random generator, int digits) {
    int base = (int) Math.pow(10, digits - 1);
    return generator.nextInt(9 * base) + base;
  }
}
