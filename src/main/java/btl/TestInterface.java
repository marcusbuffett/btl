import java.util.Scanner;
import btl.Question;

public class TestInterface {
  TwoDigitAddition strategy;
  Scanner scanner;

  public TestInterface(TwoDigitAddition strategy) {
    this.strategy = strategy;
    this.scanner = new Scanner(System.in);
  }

  public Report runStrategy() {
    return new Report();
  }
  
  public Answer askQuestion(Question question) {
    System.out.println(question.questionRep);
    long ms_before = System.currentTimeMillis();
    String response = scanner.nextLine();
    long ms_after = System.currentTimeMillis();
    float time = (ms_before - ms_after) / 1000f;
    return new Answer(time, question, response);
  }
}
