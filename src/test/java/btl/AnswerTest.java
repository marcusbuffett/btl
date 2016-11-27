package btl;

import org.junit.*;
import static org.junit.Assert.*;

public class AnswerTest {
  @Test
  public void testIsCorrect() {
    Question question = new Question("3 + 4", "7");
    Answer correctAnswer = new Answer(0.0, question, "7");
    assertTrue(correctAnswer.isCorrect());
    Answer wrongAnswer = new Answer(0.0, question, "8");
    assertFalse(wrongAnswer.isCorrect());
  }
}
