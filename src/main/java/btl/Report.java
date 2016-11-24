import java.util.ArrayList;
import java.util.List;

public class Report {
  List<Answer> wrongAnswers;
  List<Answer> rightAnswers;

  public Report(List<Answer> wrongAnswers, List<Answer> rightAnswers) {
    this.wrongAnswers = wrongAnswers;
    this.rightAnswers = rightAnswers;
  }
}
