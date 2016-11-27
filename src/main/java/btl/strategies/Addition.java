package btl;

import btl.Strategy;
import btl.Question;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Addition implements Strategy {
  public int n;
  public int augend;
  public int addend;

  public Addition(int n) {
    this.n = n;
  }

  public String getName() {
    return this.n + " Digit Addition";
  }

  public Question generateQuestion(long seed) {
    Random generator = new Random(seed);
    augend = this.generateNumber(generator);
    addend = this.generateNumber(generator);
    String question = String.format("%d + %d", augend, addend);
    String answer = Integer.toString(augend + addend);
    return new Question(question, answer);
  }

  private int generateNumber(Random generator) {
    int base = (int) Math.pow(10, this.n - 1);
    return generator.nextInt(9 * base) + base;
  }
}
