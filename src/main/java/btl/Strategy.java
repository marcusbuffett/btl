package btl;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public interface Strategy {
  public Question generateQuestion(long seed);
  public default List<Question> generateQuestions(long seed, int n) {
    Random generator = new Random(seed);
    List<Question> questions = new ArrayList<Question>();
    for (int i = 0; i < n; i++) {
      Question question = this.generateQuestion(generator.nextLong());
      questions.add(question);
    }
    return questions;
  }

  public String getName();
}
