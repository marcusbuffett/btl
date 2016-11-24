package btl;

import btl.Strategy;
import btl.Question;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class TwoDigitAddition implements Strategy {
  public Question generateQuestion(long seed) {
    Random generator = new Random(seed);
    int a = generator.nextInt(99) + 1;
    int b = generator.nextInt(99) + 1;
    String question = String.format("%d + %d", a, b);
    String answer = Integer.toString(a + b);
    return new Question(question, answer);
  }
}
