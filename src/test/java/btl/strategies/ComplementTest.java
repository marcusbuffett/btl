package btl;

import org.junit.*;
import static org.junit.Assert.*;
import btl.Complement;
import btl.Question;

public class ComplementTest {
  @Test
  public void testGenerateQuestion() {
    Complement complementStrategy = new Complement();
    for (long i = 0; i < 10; i++) {
      Question question = complementStrategy.generateQuestion(i);
      int x = Integer.parseInt(question.questionRep);
      int complement = 100 - x;
      assertEquals(Integer.parseInt(question.correctAnswer), complement);
    }
  }
}
