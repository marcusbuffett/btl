package btl;

import java.util.List;

public interface Strategy {
  public Question generateQuestion(int seed);
  public List<Question> generateQuestions(int seed);
}
