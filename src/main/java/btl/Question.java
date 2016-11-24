package btl;

import java.util.Optional;

public class Question {
  public String questionRep;
  public Optional<String> correctAnswer;

  public Question(String questionRep, Optional<String> correctAnswer) {
    this.questionRep = questionRep;
    this.correctAnswer = correctAnswer;
  }
}
