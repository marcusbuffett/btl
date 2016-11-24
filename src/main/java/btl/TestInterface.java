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
    String response = scanner.nextLine();
    float time = 10.03f;
    return new Answer(time, question, response);
  }
}
