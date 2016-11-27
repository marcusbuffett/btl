package btl;

import org.junit.*;
import static org.junit.Assert.*;
import btl.Complement;
import btl.Question;

public class MultiplicationTest {
  @Test
  public void testGenerateQuestion() {
    Multiplication multiplicationStrategy = new Multiplication(2, 1);
    for (long i = 0; i < 10; i++) {
      Question question = multiplicationStrategy.generateQuestion(i);
      int multiplier = multiplicationStrategy.multiplier;
      int multiplicand = multiplicationStrategy.multiplicand;
      int expectedAnswer = multiplier * multiplicand;
      assertEquals(Integer.parseInt(question.correctAnswer), expectedAnswer);
    }
  }
}
