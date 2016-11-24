public class TestInterface {
  TwoDigitAddition strategy;

  public TestInterface(TwoDigitAddition strategy) {
    this.strategy = strategy;
  }
  public Report runStrategy() {
    return new Report();
  }
}
