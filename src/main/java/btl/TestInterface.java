package btl;

import java.util.Scanner;
import btl.Question;
import btl.Strategy;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class TestInterface {
  Scanner scanner;
  int numQuestions;

  public TestInterface() {
    this.scanner = new Scanner(System.in);
    this.numQuestions = 10;
  }

  public <T extends Strategy> Report runStrategy(T strategy) {
    long seed = (new Random()).nextLong();
    List<Question> questions = strategy.generateQuestions(seed, this.numQuestions);
    List<Answer> wrongAnswers = new ArrayList();
    List<Answer> rightAnswers = new ArrayList();
    // TODO: Look up iterators
    for (int i = 0; i < this.numQuestions; i++) {
      Answer answer = this.askQuestion(questions.get(i));
      if (answer.isCorrect())
        rightAnswers.add(answer);
      else
        wrongAnswers.add(answer);
    }
    return new Report(wrongAnswers, rightAnswers);
  }
  
  public Answer askQuestion(Question question) {
    System.out.println(question.questionRep);
    long ms_before = System.currentTimeMillis();
    String response = scanner.nextLine();
    long ms_after = System.currentTimeMillis();
    float time = (ms_after - ms_before) / 1000f;
    return new Answer(time, question, response);
  }
}
