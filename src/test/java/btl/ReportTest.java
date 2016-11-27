package btl;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

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

  @Test
  public void testGenerateStatsRep() {
    List<Answer> answers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      Question question = new Question("x + y", new Integer(i).toString());
      // Half correct, half incorrect
      String response = new Integer(i % 2 == 0 ? i : -1).toString();
      Answer answer = new Answer((float) i, question, response);
      answers.add(answer);
    }
    Report report = new Report(answers, ReportFormat.LONG);
    String expectedAnswer = new StringBuilder()
      .append("Score: 5 / 10\n")
      .append("Average time: 4.50s\n")
      .toString();
    assertEquals(expectedAnswer, report.generateStatsRep());
  }
}
