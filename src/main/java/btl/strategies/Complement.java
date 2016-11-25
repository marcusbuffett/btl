package btl;

import btl.Strategy;
import btl.Question;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Complement implements Strategy {
  public String getName() {
    return "Complements";
  }

  public Question generateQuestion(long seed) {
    Random generator = new Random(seed);
    int n = this.generateNumber(generator);
    String question = Integer.toString(n);
    String answer = Integer.toString(100 - n);
    return new Question(question, answer);
  }

  private int generateNumber(Random generator) {
    return generator.nextInt(99) + 1;
  }
}
