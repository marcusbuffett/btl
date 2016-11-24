package btl;

import btl.TestInterface;
import btl.TwoDigitAddition;

public class Main {
  public static void main(String[] args) {
    TestInterface testInterface = new TestInterface();
    Report report = testInterface.runStrategy(new TwoDigitAddition());
    System.out.print(report.generateReportRep());
  }
}
