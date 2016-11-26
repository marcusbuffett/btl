package btl;

import btl.Strategy;
import btl.Question;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Multiplication implements Strategy {
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
    int a = this.generateNumber(generator, this.n);
    int b = this.generateNumber(generator, this.m);
    String question = String.format("%d * %d", a, b);
    String answer = Integer.toString(a * b);
    return new Question(question, answer);
  }

  private int generateNumber(Random generator, int digits) {
    int base = (int) Math.pow(10, digits - 1);
    return generator.nextInt(9 * base) + base;
  }
}
