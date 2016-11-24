package btl;

import java.util.ArrayList;
import java.util.List;
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
    return sb.toString();
  }

  public String generateAnswerRep(Answer answer) {
    StringBuilder sb = new StringBuilder();
    sb.append("Question: ");
    sb.append(answer.question.questionRep);
    sb.append("\n");
    sb.append("Correct answer: ");
    sb.append(answer.question.correctAnswer);
    sb.append("\n");
    sb.append("Your answer: ");
    sb.append(answer.question.correctAnswer);
    sb.append("\n");
    sb.append("Time taken: ");
    sb.append(answer.timeToAnswer);
    sb.append("\n");
    return sb.toString();
  }
}
