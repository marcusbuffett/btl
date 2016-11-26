package btl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import btl.ReportFormat;

public class Report {
  public List<Answer> answers;
  public ReportFormat format;

  public Report(List<Answer> answers, ReportFormat format) {
    this.answers = answers;
    this.format = format;
  }

  public String generateReportRep() {
    StringBuilder sb = new StringBuilder();
    if (this.format == ReportFormat.LONG) {
      for (int i = 0; i < this.answers.size(); i++) {
        Answer answer = this.answers.get(i);
        sb.append(this.generateAnswerRep(answer));
        sb.append("\n");
      }
    }
    for (Answer answer : this.getWrongAnswers()) {
      sb.append(this.generateAnswerRep(answer));
      sb.append("\n");
    }
    sb.append(this.generateStatsRep());
    return sb.toString();
  }

  public String generateAnswerRep(Answer answer) {
    StringBuilder sb = new StringBuilder();
    sb.append("Question: " + answer.question.questionRep + "\n");
    sb.append("Correct answer: " + answer.question.correctAnswer + "\n");
    sb.append("Your answer: " + answer.answer + "\n");
    sb.append("Time taken: " + answer.timeToAnswer + "\n");
    return sb.toString();
  }

  public String generateStatsRep() {
    List<Answer> right = this.getRightAnswers();
    List<Answer> wrong = this.getWrongAnswers();
    StringBuilder sb = new StringBuilder();
    sb.append("Score: " + right.size() + " / " + this.answers.size());
    sb.append("\n");
    double averageTime = this.answers.stream().mapToDouble(a -> a.timeToAnswer).average().orElse(0);
    sb.append("Average time: " + String.format("%.2f", averageTime) + "s");
    sb.append("\n");
    return sb.toString();
  }

  private List<Answer> getRightAnswers() {
    return this.answers.stream().filter(a -> a.isCorrect()).collect(Collectors.toList());
  }

  private List<Answer> getWrongAnswers() {
    return this.answers.stream().filter(a -> !a.isCorrect()).collect(Collectors.toList());
  }
}
