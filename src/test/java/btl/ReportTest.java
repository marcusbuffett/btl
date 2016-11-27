package btl;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;

public class ReportTest {
  @Test
  public void testGenerateAnswerRep() {
    Question question = new Question("7 * 6", "42");
    Answer answer = new Answer(0.0, question, "43");
    Report report = new Report(Arrays.asList(answer), ReportFormat.LONG);
    String expectedAnswer = new StringBuilder()
      .append("Question: " + answer.question.questionRep + "\n")
      .append("Correct answer: " + answer.question.correctAnswer + "\n")
      .append("Your answer: " + answer.answer + "\n")
      .append("Time taken: " + answer.timeToAnswer + "\n")
      .toString();
    assertEquals(expectedAnswer, report.generateAnswerRep(answer));
  }
}
