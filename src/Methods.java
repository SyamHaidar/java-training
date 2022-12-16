public class Methods {

  public static void main(String[] args) {
    sayHelloWolrd();

    sayHelloTo("David");
    sayHelloTo("Joe");

    int x = returnFive();
    System.out.println(x);

    int result = square(5);
    System.out.println(result);
  }

  static int square(int x) {
    return x * x;
  }

  static int returnFive() {
    return 5;
  }

  static void sayHelloTo(String name) {
    System.out.println("Hello, " + name);
  }

  static void sayHelloWolrd() {
    System.out.println("Hello, world!");
  }

}
