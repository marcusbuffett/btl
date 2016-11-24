package btl;

import btl.TestInterface;
import btl.NDigitAddition;

public class Main {
  public static void main(String[] args) {
    TestInterface testInterface = new TestInterface();
    Report report = testInterface.runStrategy(new NDigitAddition(3));
    System.out.print(report.generateReportRep());
  }
}
