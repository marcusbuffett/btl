package btl;

import btl.Strategy;
import btl.Question;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Addition implements Strategy {
  public int n;

  public Addition(int n) {
    this.n = n;
  }

  public String getName() {
    return this.n + " Digit Addition";
  }

  public Question generateQuestion(long seed) {
    Random generator = new Random(seed);
    int a = this.generateNumber(generator);
    int b = this.generateNumber(generator);
    String question = String.format("%d + %d", a, b);
    String answer = Integer.toString(a + b);
    return new Question(question, answer);
  }

  private int generateNumber(Random generator) {
    int base = (int) Math.pow(10, this.n - 1);
    return generator.nextInt(9 * base) + base;
  }
}
