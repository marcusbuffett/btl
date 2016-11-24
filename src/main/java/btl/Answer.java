package btl;

import btl.Question;

public class Answer {
  public double timeToAnswer;
  public Question question;
  public String answer;

  public Answer(double timeToAnswer, Question question, String answer) {
    this.timeToAnswer = timeToAnswer;
    this.question = question;
    this.answer = answer;
  }

  public boolean isCorrect() {
    return this.answer == this.question.correctAnswer;
  }
}
