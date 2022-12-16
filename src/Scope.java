public class Scope {

  static int x;

  public static void main(String[] args) {
    x = 5;
    System.out.println(x);

    doSomething();
    System.out.println();
  }

  static void doSomething() {
    x = 10;
  }

  static void doSomethingLocally() {
    int y = 100;
    System.out.println(y);
  }

}
