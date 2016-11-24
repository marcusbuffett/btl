package btl;

import java.util.ArrayList;
import java.util.List;
import btl.ReportFormat;

public class Report {
  List<Answer> answers;
  ReportFormat format;

  public Report(List<Answer> answers, ReportFormat format) {
    this.answers = answers;
    this.format = format;
  }
}
