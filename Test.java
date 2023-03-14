
public class Test {
  private String message;

  public Test(String message) {
    this.message = message;
  }

  public void theMessage() {
    System.out.println(message);
  }

  public static void main(String[] args) {
    Test test = new Test("Hello, world!");
    test.theMessage();
  }
}
