package btl;

import java.util.Scanner;
import btl.Question;
import btl.Strategy;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MenuInterface {
  List<Strategy> strategies;
  public MenuInterface() {
    this.strategies = new ArrayList<>();
    Collections.addAll(
        this.strategies,
        new Addition(2),
        new Addition(3),
        new Multiplication(2, 1),
        new Complement(),
        new Square(2)
    );
  }

  public void start() {
    Strategy strategy = this.askForStrategy();
    TestInterface testInterface = new TestInterface();
    Report report = testInterface.runStrategy(strategy);
    System.out.print(report.generateReportRep());
    System.out.println();
    start();
  }

  public Strategy askForStrategy() {
    for (int i = 0; i < this.strategies.size(); i++) {
      System.out.println((i + 1) + ") " + this.strategies.get(i).getName());
    }
    System.out.println("Which strategy would you like to be tested on?");
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    // TODO: Handle invalid choice
    return this.strategies.get(choice - 1);
  }
}
