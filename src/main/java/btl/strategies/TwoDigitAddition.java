import btl.Strategy;
import btl.Question;
import java.util.List;
import java.util.ArrayList;

public class TwoDigitAddition implements Strategy {
  public Question generateQuestion(long seed) {
    // Get a random two digit number from seed
    // Get a random two digit number from seed
    // answer = a + b
    // questionRep = Concat numbers together
    return new Question("23 + 73", "96");
  }
}
