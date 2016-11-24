package btl;

import btl.Strategy;
import btl.Question;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class NDigitAddition implements Strategy {
  public int n;

  public NDigitAddition(int n) {
    this.n = n;
  }

  public Question generateQuestion(long seed) {
    Random generator = new Random(seed);
    int a = this.generateNumber(generator);
    int b = this.generateNumber(generator);
    String question = String.format("%d + %d", a, b);
    String answer = Integer.toString(a + b);
    return new Question(question, answer);
  }

  private int generateNumber(generator) {
    return generator.nextInt(90) + 10;
  }
}
