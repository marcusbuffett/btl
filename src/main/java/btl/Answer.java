import btl.Question;

public class Answer {
  float timeToAnswer;
  Question question;
  String answer;

  public boolean isCorrect() {
    return this.answer == this.question.correctAnswer;
  }
}
