package btl;

import btl.Question;

public class Answer {
  float timeToAnswer;
  Question question;
  String answer;

  public Answer(float timeToAnswer, Question question, String answer) {
    this.timeToAnswer = timeToAnswer;
    this.question = question;
    this.answer = answer;
  }

  public boolean isCorrect() {
    return this.answer == this.question.correctAnswer;
  }
}
