package btl;

import org.junit.*;
import static org.junit.Assert.*;

public class AdditionTest {
  @Test
  public void generateQuestionTest() {
    Addition additionStrategy = new Addition(2);
    for (long i = 0; i < 10; i++) {
      Question question = additionStrategy.generateQuestion(i);
      int augend = additionStrategy.augend;
      int addend = additionStrategy.addend;
      int expectedAnswer = augend + addend;
      assertEquals(Integer.parseInt(question.correctAnswer), expectedAnswer);
    }
  }
}
